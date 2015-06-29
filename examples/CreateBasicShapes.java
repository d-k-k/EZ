import java.awt.Color;


/**
 * EZ comes with two basic shapes, circles and rectangles.
 */

public class CreateBasicShapes {

  public static void main(String[] args) {
    EZ.initialize(500, 500);
    
    /* Circles and rectangles require 6 attributes to be created, they are:
     * x and y center location.
     * width and height.
     * color.
     * and fillStatus, whether or not it should be filled or just an outline.
     * 
     */
    int xCenter = 125;
    int yCenter = 125;
    int width = 250;
    int height = 250;
    Color color = Color.blue;
    boolean fillStatus = true;
    //This will create a blue circle a blue circle
    EZ.addCircle(xCenter, yCenter, width, height, color, fillStatus);
    
    xCenter += 250;
    /* With a window of 500x500. The initial xCenter of 125 will place the first circle in the upper left corner.
     * The previous line will add 250 to the xCenter variable.
     * This will not affect the first circle.
     * Instead it will affect where the following circle is made.
     */
    EZ.addCircle(xCenter, yCenter, width, height, color, fillStatus);
    
    width = 150;
    height = 150;
    color = Color.red;
    //This next circle will be on top the right one, but a red and smaller.
    EZ.addCircle(xCenter, yCenter, width, height, color, fillStatus);
    
    width = 50;
    height = 50;
    color = Color.green;
    //A third for the stack, smaller and green.
    EZ.addCircle(xCenter, yCenter, width, height, color, fillStatus);
    
    
    //start with making a backdrop
    width = 500;
    height = 250;
    xCenter = 250;
    yCenter = 375;
    color = Color.black;
    EZ.addRectangle(xCenter, yCenter, width, height, color, fillStatus);
    
    //Now for some rectangles.
    width = 100;
    height = 100;
    xCenter = 100;
    yCenter = 375;
    color = Color.green;
    EZ.addRectangle(xCenter, yCenter, width, height, color, fillStatus);
    
    int xmod = 50;
    int ymod = 50;
    for(int i = 1; i <= 6; i++) {
      if(i % 2 == 0) { ymod *= -1; }
      xCenter += xmod;
      yCenter += ymod;
      
      if( i % 3 == 0) { color = Color.orange; }
      if( i % 3 == 1) { color = Color.cyan; }
      if( i % 3 == 2) { color = Color.magenta; }

      EZ.addRectangle(xCenter, yCenter, width, height, color, fillStatus);
    } //end for i <= 6
    
  } //end main
} //end class



