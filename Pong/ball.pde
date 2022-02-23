class Ball {

  color c;
  float xpos;
  float ypos;
  float ballSpeedX;
  float ballSpeedY;
  int radius;

  Ball() {
    c = color(255);
    xpos = width/2;
    ypos = height/2;
    ballSpeedX = 3.0;
    ballSpeedY = ballSpeedX;
    radius = 6;
  }


  void display() {
    
    fill(c);
    ellipse(xpos, ypos, radius, radius);
    
    
  }
  //Move object argument allow us to us tempBar1. and tempBar2. functions 
  void move(Bar tempBar1, Bar tempBar2) {
    //Getting bar attributes for collision - !Unnessesary.!
    /*tempBar1.tempBarHeight();
    tempBar1.tempBarWidth();
    tempBar1.tempPosBarY();
    tempBar1.tempPosBarX();
    tempBar2.tempBarHeight();
    tempBar2.tempBarWidth();
    tempBar2.tempPosBarY();
    tempBar2.tempPosBarX();*/
    
    xpos += ballSpeedX;
    ypos += ballSpeedY;
    
    //Collision for Bar Player1
     if (xpos > tempBar1.tempPosBarX() && xpos < tempBar1.tempPosBarX() + tempBar1.tempBarWidth() && ypos > tempBar1.tempPosBarY() && ypos < tempBar1.tempPosBarY() + tempBar1.tempBarHeight()) {
      ballSpeedX *= -1;
    }
    //Collision for Bar Player2
     if (xpos > tempBar2.tempPosBarX() && xpos < tempBar2.tempPosBarX() + tempBar2.tempBarWidth() && ypos > tempBar2.tempPosBarY() && ypos < tempBar2.tempPosBarY() + tempBar2.tempBarHeight()) {
      ballSpeedX *= -1;

    }
    //Bounce on window top and bottom    
    if (ypos > height || ypos < 0) {
      ballSpeedY *= -1;
    }
      
 
    
  }
  void score() {  
     if (xpos == 0) {
       println("player 2 point");
       
     } else if (xpos == width) {
       println("player 1 point");
       
     } 
  }
  
}
