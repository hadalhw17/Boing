/**
 * Created by geron on 24.02.2017.
 */
import java.awt.*;
public class Square extends ClosedShape {

    private int side;
    public Square(int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled, Color newColor, boolean flashing){
        super (insertionTime, x, y, vx, vy, colour, isFilled, newColor, flashing);
        this.side = side;
    }

    public String toString () {
        String result = "This is a square\n";
        result += super.toString ();
        result += "Its side size is " + this.side + "\n";
        return result;
    }


    public void setSide (int side) {
        this.side = side;
    }

    /**
     * @return The diameter of the square.
     */
    public int getSide() {
        return side;
    }

    /**
     * @return The width of the square
     */
    public int getWidth() {
        return side;
    }

    /**
     * @return The height of the square
     */
    public int getHeight() {
        return side;
    }

    public void draw (Graphics g) {
        g.setColor( colour );
        if (isFilled) {
            g.fillRect( xPos, yPos, side, side );
        }
        else {
            g.drawRect( xPos, yPos, side, side );
        }
    }
}
