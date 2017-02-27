import java.awt.*;

/**
 * Created by geron on 24.02.2017.
 */
public class Rect extends ClosedShape {
    private int width;
    private int height;
    public Rect(int insertionTime, int x, int y, int vx, int vy, int width,int height, Color colour, boolean isFilled, Color newColor, boolean flashing){
        super (insertionTime, x, y, vx, vy, colour, isFilled, newColor, flashing);
        this.width = width;
        this.height = height;
    }

    public String toString () {
        String result = "This is a square\n";
        result += super.toString ();
        result += "Its side width is " + this.width + "\n";
        result += "Its height width is " + this.height + "\n";
        return result;
    }


    public void setWidth (int width) {
        this.width = width;
    }

    /**
     * @param height Resets the height.
     */
    public void setHeight (int height) {
        this.height = height;
    }

    /**
     * @return The width of the oval.
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return The height of the oval.
     */
    public int getHeight() {
        return height;
    }

    public void draw (Graphics g) {
        g.setColor( colour );
        if (isFilled) {
            g.fillRect( xPos, yPos, width, height );
        }
        else {
            g.drawRect( xPos, yPos, width, height );
        }
    }
}
