/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import java.awt.*;
import java.io.*;
import java.util.Scanner;


public class ReadShapeFile {

	public static Queue createCircle(Scanner in){
		Queue queue = new Queue();
		int px, py,vx,vy,r,g,b,r1,g1,b1,insertionTime,width, height, diametr;
		boolean isFilled, flash;
		px = Integer.parseInt(in.next());
		py = Integer.parseInt(in.next());
	    vx = Integer.parseInt(in.next());
	    vy = Integer.parseInt(in.next());
	    isFilled = Boolean.valueOf(in.next());
	    diametr = Integer.parseInt(in.next());
	    r = Integer.parseInt(in.next());
	    g = Integer.parseInt(in.next());
	    b = Integer.parseInt(in.next());
	    Color color = new Color(r,g,b);
	    insertionTime = Integer.parseInt(in.next());
		r1 = Integer.parseInt(in.next());
		g1 = Integer.parseInt(in.next());
		b1 = Integer.parseInt(in.next());
		flash = Boolean.valueOf(in.next());
		Color newColor = new Color(r1,g1,b1);
		Object hope = new Circle(insertionTime,px,py,vx,vy,diametr,color,isFilled, newColor, flash);
		queue.enqueue(hope);
		return queue;
	}
	public static Queue createOval(Scanner in){
		Queue queue = new Queue();
		int px, py,vx,vy,r,g,b,r1,g1,b1,insertionTime,width, height;
		boolean isFilled, flash;
		px = Integer.parseInt(in.next());
		py = Integer.parseInt(in.next());
		vx = Integer.parseInt(in.next());
		vy = Integer.parseInt(in.next());
		isFilled = Boolean.valueOf(in.next());
		width = Integer.parseInt(in.next());
		height = Integer.parseInt(in.next());
		r = Integer.parseInt(in.next());
		g = Integer.parseInt(in.next());
		b = Integer.parseInt(in.next());
		Color color = new Color(r,g,b);
		insertionTime = Integer.parseInt(in.next());
		r1 = Integer.parseInt(in.next());
		g1 = Integer.parseInt(in.next());
		b1 = Integer.parseInt(in.next());
		Color newColor = new Color(r1,g1,b1);
		flash = Boolean.valueOf(in.next());
		Object hope = new Oval(insertionTime,px,py,vx,vy,width,height,color,isFilled, newColor, flash);
		queue.enqueue(hope);
		return queue;
	}

	public static Queue createSquare(Scanner in){
		Queue queue = new Queue();
		int px, py,vx,vy,r,g,b,r1,g1,b1,insertionTime,width, height, side;
		boolean isFilled, flash;
		px = Integer.parseInt(in.next());
		py = Integer.parseInt(in.next());
		vx = Integer.parseInt(in.next());
		vy = Integer.parseInt(in.next());
		isFilled = Boolean.valueOf(in.next());
		side = Integer.parseInt(in.next());
		r = Integer.parseInt(in.next());
		g = Integer.parseInt(in.next());
		b = Integer.parseInt(in.next());
		Color color = new Color(r,g,b);
		insertionTime = Integer.parseInt(in.next());
		r1 = Integer.parseInt(in.next());
		g1 = Integer.parseInt(in.next());
		b1 = Integer.parseInt(in.next());
		Color newColor = new Color(r1,g1,b1);
		flash = Boolean.valueOf(in.next());
		Object hope = new Square(insertionTime,px,py,vx,vy,side,color,isFilled, newColor, flash);
		queue.enqueue(hope);
		return queue;
	}

	public static Queue createRect(Scanner in){
		Queue queue = new Queue();
		int px, py,vx,vy,r,g,b,r1,g1,b1,insertionTime,width, height;
		boolean isFilled, flash;
		px = Integer.parseInt(in.next());
		py = Integer.parseInt(in.next());
		vx = Integer.parseInt(in.next());
		vy = Integer.parseInt(in.next());
		isFilled = Boolean.valueOf(in.next());
		width = Integer.parseInt(in.next());
		height = Integer.parseInt(in.next());
		r = Integer.parseInt(in.next());
		g = Integer.parseInt(in.next());
		b = Integer.parseInt(in.next());
		Color color = new Color(r,g,b);
		insertionTime = Integer.parseInt(in.next());
		r1 = Integer.parseInt(in.next());
		g1 = Integer.parseInt(in.next());
		b1 = Integer.parseInt(in.next());
		Color newColor = new Color(r1,g1,b1);
		flash = Boolean.valueOf(in.next());
		Object hope = new Rect(insertionTime,px,py,vx,vy,width,height,color,isFilled, newColor, flash);
		queue.enqueue(hope);
		return queue;
	}

	public static Queue createString(Scanner in){
		Queue queue = new Queue();
		int px, py,vx,vy,r,g,b,r1,g1,b1,insertionTime,width, height;
		boolean isFilled, flash;
		String text;
		px = Integer.parseInt(in.next());
		py = Integer.parseInt(in.next());
		vx = Integer.parseInt(in.next());
		vy = Integer.parseInt(in.next());
		isFilled = Boolean.valueOf(in.next());
		text = in.next().toString();
		r = Integer.parseInt(in.next());
		g = Integer.parseInt(in.next());
		b = Integer.parseInt(in.next());
		Color color = new Color(r,g,b);
		insertionTime = Integer.parseInt(in.next());
		r1 = Integer.parseInt(in.next());
		g1 = Integer.parseInt(in.next());
		b1 = Integer.parseInt(in.next());
		Color newColor = new Color(r1,g1,b1);
		flash = Boolean.valueOf(in.next());
		Object hope = new MyString(insertionTime,px,py,vx,vy,color,text,isFilled, newColor, flash);
		queue.enqueue(hope);
		return queue;
	}
	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * @param in the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue readDataFile (Scanner in) {
		Queue shapeQueue = new Queue ();
		Queue newQueue = new Queue();
		String line = null;
		while(in.hasNextLine()){
			line = in.nextLine();
			Scanner lineSc = new Scanner(line);

			String curLine = lineSc.next();
			if(curLine.equals("oval")){
				while(lineSc.hasNext()){
					newQueue = createOval(lineSc);
					while(!newQueue.isEmpty()){
						shapeQueue.enqueue(newQueue.peek());
						newQueue.dequeue();
					}
				}
			}
			else if(curLine.equals("square")){
				while(lineSc.hasNext()){
					newQueue = createSquare(lineSc);
					while(!newQueue.isEmpty()){
						shapeQueue.enqueue(newQueue.peek());
						newQueue.dequeue();
					}
				}
			}
			else if(curLine.equals("circle")){
				System.out.print("Im here");
				while(lineSc.hasNext()){
					newQueue = createCircle(lineSc);
					while(!newQueue.isEmpty()){
						shapeQueue.enqueue(newQueue.peek());
						newQueue.dequeue();
					}
				}
			}
			else if(curLine.equals("rect")){
				while(lineSc.hasNext()){
					newQueue = createRect(lineSc);
					while(!newQueue.isEmpty()){
						shapeQueue.enqueue(newQueue.peek());
						newQueue.dequeue();
					}
				}
			}
			else if(curLine.equals("string")){
				while(lineSc.hasNext()){
					newQueue = createString(lineSc);
					while(!newQueue.isEmpty()){
						shapeQueue.enqueue(newQueue.peek());
						newQueue.dequeue();
					}
				}
			}
		}
		shapeQueue.print();
		return shapeQueue;
	}

	/**
	 * Method to read the file and return a queue of shapes from this file.  The program should handle
	 * the file not found exception here and shut down the program gracefully.
	 * @param filename the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue readFile (String filename) {
		File inFile = new File(filename);

		Scanner in = null;
		try{
			in = new Scanner(inFile);
		}
		catch(FileNotFoundException e){

			System.out.print("No!!");
		}

		return ReadShapeFile.readDataFile(in);
	}
}