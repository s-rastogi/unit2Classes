import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.Random;


/**
 * Class that has the building constructor and draw method 
 * @author srastogi
 * @version 9 October 2015
 */
public class Building
{
    /** xLeft and yTop - top left point coordinates of the building
    * rectHeight and rectWidth- height and width of rectangle...
    */
    private int xLeft;
    private int yTop;
    private int rectHeight;
    private int rectWidth;

    /**
     * a constructors who constructs a building 
     */
    public Building(int x, int y, int w, int h)
    {
        xLeft = x;
        yTop = y;
        rectHeight = h;
        rectWidth = w;
        
    }

    /**
     * The paintComponent method takes g2 of the Graphics class as a parameter and creates instances of the shape classes.
     *
     * 
     * @post   once draw method is used it will create and draw components
     *            
     * @param    g2   all i know is that is allows it draw components
     * @return    return type - void
     */
    public void draw(Graphics2D g2)
    {
        
        Rectangle building = new Rectangle(xLeft, yTop, rectWidth, rectHeight);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(building);
        g2.draw(building);
        
        
        
   

} 
}