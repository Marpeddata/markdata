Ball Ball;
Bar Bar1;
Bar Bar2;


void setup () {
  size(600,400);
  background(100);
  Ball = new Ball();
  Bar2 = new Bar(width-25);
  Bar1 = new Bar(25);
}

void draw() {
 background(100);
 //Player1 Display and control
 Bar1.display();
  if (keyPressed) {
   if (key == 'w') {
 Bar1.moveUp();
   }
 }
  if (keyPressed) {
   if (key == 's') {
 Bar1.moveDown();
   }
 }
 //Player2 Display and Control
 Bar2.display();
 if (keyPressed) {
   if (key == 'p') {
 Bar2.moveUp();
   }
 }
  if (keyPressed) {
   if (key == 'æ') {
 Bar2.moveDown();

   }
    
 }
 Ball.display();
 //Ball move takes Bar objects as arguments.
 Ball.move(Bar1,Bar2);
 Ball.score();
 }
