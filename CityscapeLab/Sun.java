
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Class that contains the sun constructor and draw method  
 * @author srastogi
 * @version 9 October 2015
 */
public class Sun
{
     /** xLeft and yTop - top left point coordinates of the sun
    * rectHeight and rectWidth- height and width of rectangle...
    */
    private int xLeft;
    private int yTop;
    private int rectHeight;
    private int rectWidth;

    /**
     * This constructor consructs a sun with a given left corner and height and width of the bounding rectangle.
     */
    public Sun(int x, int y,int w, int h)
    {
        xLeft = x;
        yTop = y;
        rectHeight = h;
        rectWidth = w;
    }

     /**
     * The paintComponent method takes g2 as a parameter and creates instances of the specific shape classes.
     *
     * 
     * @post   once draw method is used it will create and draw components
     *            
     * @param    g2   all i know is that is allows it to draw components
     * @return    return type - void
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft,yTop,rectHeight, rectWidth);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }
}
