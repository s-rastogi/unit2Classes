import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
    

    /**
     * Default constructor for objects of class TargetComponent
     */
    public void paintComponent(Graphics g)
    {
       Graphics2D paintbrush = (Graphics2D) g;
       int x = getWidth()/2;
       int y = getHeight()/2;
       Target target= new Target(x,y);
       Target.draw(paintbrush);
    }


}
