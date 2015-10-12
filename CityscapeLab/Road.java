import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 *  contains the road constructor and draw method which is invoked in Component class. 
 *  draws road markers.
 * 
 * @author ssrastogi
 * @version 10 October 2015
 */
public class Road
{
    /** xLeft and yTop are the coordinates of the top left corner of the road of course
    * rectHeight and rectWidth- height and width of rectangle(kind of self explantory - what is the point of this i wonder)
    */
    private int xLeft;
    private int yTop;
    private int rectHeight;
    private int rectWidth;

     /**
     * a constructor that constucts a building
     */
    public Road(int x, int y, int w, int h)
    {
        xLeft = x;
        yTop = y;
        rectHeight = h;
        rectWidth = w;
    }

     /**
     * The paintComponent method takes g2 as a parameter and creates instances of the shape classes. 
     *
     * 
     * @post    it will draw objects when the draw method is invoked
     *            
     * @param    g2    i really dont understand the parameters for this
     * @return    return type-void
     */
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle (xLeft, yTop, rectWidth, rectHeight);
        g2.setColor(Color.BLACK);
        g2.fill(road);
        g2.draw(road);
       
        g2.setColor(Color.YELLOW);
        for (int i=xLeft; i<rectWidth;)
        { 
            Rectangle marker = new Rectangle (i, 450, 30, 10);
            g2.fill(marker);
            g2.draw(marker);
           
            i+=50;
           
            
           
            
            
    }

}
} 
