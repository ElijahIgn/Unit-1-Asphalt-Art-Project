import org.code.neighborhood.*;
public class MarcelinePainter extends MuralPainter{

  // Final method
  public void paintAxeBass(){
    paintPlus();
paintNeck();
    paintBody();
  }
/*
  * Paints the neck of the Axe Bass
   * Starting from the tuning pegs
  */ 
  public void paintNeck(){
    setPaint(6);
    turnRight();
    move();
    paint("DimGray");
    while (hasPaint()){
      move();
      turnLeft();
      move();
      paint("DimGray");
      turnRight();
    }
    
   }
    
  /*
  * Paints the body of the Axe Bass
  * Starting from the bottom of the neck
  */ 
  public void paintBody(){
    setPaint(19);
    move();
    paint("DarkRed");
    turnRight();
    move();
    paint("DarkRed");
    move();
    paint("Gray");
    turnLeft();
    move();
    turnLeft();
    move();
    paint("Gray");
    move();
    paint("DarkRed");
    turnRight();
    move();
    paint("Gray");
    turnLeft();
    move();
    paint("DarkRed");
    turnRight();
    move();
    paint("Gray");
    turnAround();
    move();
    move();
    paint("DarkRed");
    move();
    paint("DarkRed");
    turnRight();
    move();
    paint("DarkRed");
    move();
    paint("DarkRed");
    move();
    paint("Gray");
    turnAround();
    move();
    turnRight();
    move();
    paint("Gray");
    turnLeft();
    move();
    paint("DarkRed");
    turnRight();
    move();
    paint("Gray");
    move();
    turnLeft();
    move();
    paint("Gray");
    turnLeft();
    move();
    paint("DarkRed");
    move();
    paint("DarkRed");
    
    
    
  }
// Paints the tuning pegs
  public void paintPlus(){
    setPaint(5);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    paint("Maroon");
    move();
    paint("Maroon");
    turnToNorth();
    turnLeft();
    move();
    paint("Maroon");
    turnAround();
    move();
    move();
    paint("Maroon");
    turnAround();
    move();
    turnLeft();
    move();
    paint("Maroon");
  }  
}