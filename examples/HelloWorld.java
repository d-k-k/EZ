import java.awt.Color;

/**
* For all example files, move them to the same folder that the EZ.java file is located and compile.
* 
*/

public class HelloWorld {

	public static void main(String[] args) {

	  //The following will create a window with the specified width and height;
	  int width = 100;
	  int height = 100;
	  EZ.initialize(width, height);
	  
	  /* The following will place the text "Hello World".
	   * It will be centered at position 50,50 (half the window, so also in the middle of the window).
	   * The color to render the text in is black.
	   * It is using the Java's class definition for color, which is why the import statement at the top is necessary.
	   */
	  int xCenter = 50;
	  int yCenter = 50;
	  String msg = "Hello World";
	  Color c = Color.black;
	  EZ.addText(xCenter, yCenter, msg, c);

	} //end main
} //end class