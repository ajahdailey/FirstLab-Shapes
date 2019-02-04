
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle cloud;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(230);
        wall.moveHorizontal(60);
        wall.changeSize(70);
        wall.makeVisible();
        wall.changeColor("blue");

        wall = new Square();
        wall.moveVertical(250);
        wall.moveHorizontal(120);
        wall.changeSize(50);
        wall.makeVisible();
        wall.changeColor("blue");
        
        wall = new Square();
        wall.moveVertical(250);
        wall.moveHorizontal(20);
        wall.changeSize(50);
        wall.changeColor("blue");
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(280);
        wall.moveHorizontal(85);
        wall.changeSize(20);
        wall.makeVisible();
        wall.changeColor("blue");
        
        wall = new Square();
        wall.moveVertical(200);
        wall.moveHorizontal(100);
        wall.changeSize(30);
        wall.makeVisible();

        roof = new Triangle();
        roof.changeSize(60, 70);
        roof.moveHorizontal(95);
        roof.moveVertical(170);
        roof.makeVisible();
        roof.changeColor("red");

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(40);
        sun.changeSize(60);
        sun.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("green");
        cloud.moveHorizontal(20);
        cloud.moveVertical(60);
        cloud.changeSize(30);
        cloud.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("green");
        cloud.moveHorizontal(40);
        cloud.moveVertical(60);
        cloud.changeSize(30);
        cloud.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
