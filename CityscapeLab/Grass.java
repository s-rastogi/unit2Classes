import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Class that has the grass constructor and draw method 
 * 
 * 
 * @author srastogi
 * @version 10 October 2015
 */
public class Grass
{
    /**   xLeft and yTop are the coordinates of the top left corner of the road of course
    * rectHeight and rectWidth- height and width of rectangle(kind of self explantory - what is the point of this i wonder)
    */
  
    private int xLeft;
    private int yTop;
    private int rectWidth;
    private int rectHeight;

    /**
     * This constructor consructs a rectangle which will later be percieved as grass
     */
    public Grass(int x, int y, int w, int h)
    {
        xLeft = x;
        yTop = y;
        rectWidth = w;
        rectHeight = h;
    }

    /**
     *  The paintComponent method takes g2 as a parameter and creates instances of the shape classes. 
     *
     * 
     * @post    it will draw objects when the draw method is invoked
     *            
     * @param    g2    i really dont understand the parameters for this
     * @return    return type-void
     */
    public void draw(Graphics2D g2)
    {
        Rectangle grass = new Rectangle (xLeft, yTop, rectWidth, rectHeight);
        g2.setColor(Color.GREEN);
        g2.fill(grass);
        g2.draw(grass);
        
    }

}
