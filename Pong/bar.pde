class Bar {
  
  color c;
  float ypos;
  float xpos;
  float barSpeed;
  int barWidth = 10;
  int barHeight = 60; 
  
Bar(float tempXpos) {
  c = color(255);
  xpos = tempXpos;
  ypos = height/2;
  barSpeed = 5.0;

  }
  //Show Bar
  void display() {
  rectMode(CENTER);
  fill(c);
  rect(xpos,ypos,barWidth,barHeight);
  
  }
  //Move the bar up and down
  void moveUp() { 
      ypos -= barSpeed;   
  }
  
  void moveDown() {
      ypos += barSpeed;     
  }
  
  //Returning values to ball Objekt for collision.
  int tempBarHeight() {
    return barHeight;
  }
  int tempBarWidth() {
    return barWidth;
  }
  float tempPosBarY() {
    return ypos;
  }
  float tempPosBarX() {
    return xpos;
  }
  
  
}
