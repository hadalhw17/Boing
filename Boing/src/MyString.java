import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Created by geron on 24.02.2017.
 */
public class MyString extends ClosedShape {

    private String text;
    public MyString(int insertionTime, int x, int y, int vx, int vy, Color colour, String text, boolean isFilled, Color newColor, boolean flashing){
        super (insertionTime, x, y, vx, vy, colour, isFilled, newColor, flashing);
        this.text = text;
    }

    public String toString () {
        String result = "This is an image\n";
        result += super.toString ();
        return result;
    }
    public void draw (Graphics g) {
        g.setColor( colour );
        g.drawString(text, xPos, yPos);
    }
}
