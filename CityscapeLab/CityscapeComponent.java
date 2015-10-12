import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes in the cityscape

 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
Random randomHeightGenerator;
int randomHeight;
int randomHeight2;
Random randomWidthGenerator;
int randomWidth;
int randomWidth2;
Building building1;
Building building2;
Grass grass1;
Road road1;
Sun sun1;
int sunanimation;
int WidthofSun;

    public CityscapeComponent(int Width )
    {
        //Creates random dimension for the 2 buildings
        WidthofSun = Width;
        randomHeightGenerator = new Random();
        randomHeight = randomHeightGenerator.nextInt(300);
        randomHeight2 = randomHeightGenerator.nextInt(300);
        randomWidthGenerator = new Random();
        randomWidth = randomWidthGenerator.nextInt(65);
        randomWidth2 = randomHeightGenerator.nextInt(6);
        
        //Insantiates buildings
        building1 = new Building(300,200-randomHeight,randomWidth+100, randomHeight+100);
        building2 = new Building (100,200-randomHeight2,randomWidth2+100, randomHeight2+100);
        //Insantiates grass
        grass1 = new Grass(0,300, 1000, 300);
        //Instantiates the road
        road1 = new Road (0,400,1000,100);
    }   
 
        public void paintComponent(Graphics g)
        { 
            
        Graphics2D g2 = (Graphics2D) g;
        

       
       

        // draws buildings
        building1.draw(g2);
        building2.draw(g2);
        
       
        // draws grass
        
        grass1.draw(g2);
        
        //draws road
        
        road1.draw(g2);
        
        //draws sun
     
        sun1.draw(g2);
        
    }

     public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // …
         sunanimation += 10;
       
         sun1 = new Sun(600+ sunanimation, 0 , 70,WidthofSun);
         
         repaint();
         

    }
}


