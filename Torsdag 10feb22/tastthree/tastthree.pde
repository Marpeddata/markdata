//3.a
int red = color(255, 0, 0);
int yellow = color(255, 255, 0);
int green = color(0, 255, 0);
int background = 0;

// 3.b
int off = 150;

int count = 0;

void setup() {
  size(200, 650);

  //box
  rectMode(CORNER);
  fill(background);
  rect(0, 0, 200, 650);

  //red
  ellipseMode(CORNER);
  fill(off);
  ellipse(0, 10, 200, 200);

  //yellow
  ellipseMode(CORNER);
  fill(off);
  ellipse(0, 225, 200, 200);

  //green
  ellipseMode(CORNER);
  fill(off);
  ellipse(0, 440, 200, 200);
}

// 3.c
void draw() {
  count = count + 1;
  if (count < 30) {
    //red
    ellipseMode(CORNER);
    fill(red);
    ellipse(0, 10, 200, 200);

    //yellow
    ellipseMode(CORNER);
    fill(off);
    ellipse(0, 225, 200, 200);

    //green
    ellipseMode(CORNER);
    fill(off);
    ellipse(0, 440, 200, 200);
  } else if (count < 60) {
    //red
    ellipseMode(CORNER);
    fill(off);
    ellipse(0, 10, 200, 200);

    //yellow
    ellipseMode(CORNER);
    fill(yellow);
    ellipse(0, 225, 200, 200);

    //green
    ellipseMode(CORNER);
    fill(off);
    ellipse(0, 440, 200, 200);
    
  } else if (count < 90) {
    //red
    ellipseMode(CORNER);
    fill(off);
    ellipse(0, 10, 200, 200);

    //yellow
    ellipseMode(CORNER);
    fill(off);
    ellipse(0, 225, 200, 200);

    //green
    ellipseMode(CORNER);
    fill(green);
    ellipse(0, 440, 200, 200);
  } else {
    count = 0;
  }
}
