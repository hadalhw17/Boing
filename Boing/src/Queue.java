
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by LinkedListElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author you
 *
 */

import java.util.NoSuchElementException;
import org.w3c.dom.Node;
import org.w3c.dom.*;

public class Queue {

	private QueueElement front;
	private QueueElement back;
	private int s;
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
		front = null;
		back = null;
		s = 0;
	}
	
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty() {
		if(s == 0)
			return true;
		else
			return false;
	}
	
	/**
	 * 
	 */
	
	/**
	 * Returns the element at the head of the queue
	 */
	public Object peek () throws NoSuchElementException {
		if (isEmpty()) throw new NoSuchElementException("Queue underflow");
		return front.getElement();
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public Object dequeue() throws NoSuchElementException {
		Object x;
		if( isEmpty() ) {throw new NoSuchElementException("Queue underflow");}
		x = front.getElement();
		front = front.getNext();
		s--;
		return x;
	}
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue(Object x) {
		QueueElement oldBack = back;
		back = new QueueElement(x,back);
		back.setElement(x);
		back.setNext(null);
		if( isEmpty() )
			front = back;
		else
			oldBack.setNext(back);
		s++;
	}
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print () {

			QueueElement temp = front;
			while(temp != null) {
				System.out.println(temp.getElement().toString());
				temp = temp.getNext();
			}

	}
}