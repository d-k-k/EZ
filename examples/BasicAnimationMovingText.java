import java.awt.Color;


/**
 * Creating a basic animation with moving text.
 * 
 * This will require the user to keep a reference to the object and use an updater loop.
 *
 */
public class BasicAnimationMovingText {
  
  public static void main(String[] args) {
    EZ.initialize(300, 100);
    
    /* Creates text in the middle of the window displaying "I'm moving..."
     * But also puts the reference into variable text.
     * This allows later manipulation of the visual element.
     */
    EZText text = EZ.addText(150, 50, "I'm moving...", Color.black);
    
    /* The while true loop is an always activating loop.
     * At this point, the program will continue to perform the contents of the loop.
     */
    while(true) {
      /* This next call is necessary for animation.
       * It does many things in the background, but the main think to know is that this call is what will
       * update all visual changes through manipulation.
       */
      EZ.refreshScreen();
      
      /* The translateBy() method takes two parameters, the first value is for x, the second is for y.
       * The object will alter its current position by the specified amount in pixels.
       * In this case, it moves 1px to the left and has no change in the y axis.
       */
      text.translateBy(-1, 0);
      
      /* There would be nothing left to see if the text goes off the screen.
       * First a check is made to see if it is completely off screen,
       * if so, then move to the right side of the screen.
       */
      if( text.getXCenter() + text.getWidth() < 0 ) {
        text.translateBy(EZ.getWindowWidth() + text.getWidth() * 2, 0);
      }
      
      
    } //end updater loop
    
    
  } //end main
} //end class
