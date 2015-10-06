import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;


/**
 * Write a description of class Building here.
 * 
 * @author Saahil Rastogi
 * @version 10/1/15
 */
public class Building 
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop= y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle body1= new Rectangle(xLeft-250,yTop,500,1000);
        Rectangle body2= new Rectangle(xLeft,yTop+250,200,1000);
        Rectangle body3= new Rectangle(xLeft+550,yTop+20,100,1000);
        Rectangle body4= new Rectangle(xLeft-400,yTop,700,100);
        Rectangle body5= new Rectangle(xLeft+400,yTop+40,90,1000);
        g2.draw(body1);
        g2.draw(body2);
        g2.draw(body3);
        g2.draw(body4);
        g2.draw(body5);
    }

}




