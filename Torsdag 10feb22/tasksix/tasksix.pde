//6.a
int a = 5;
int b = 5;

int x = 12;
int y = 10;
int z = 8;

if (a == 10 && b == 10) {
  println("success");
} else if (a + b == 10) {
  println("success");
} else {
  println("failure!");
}

//6.b
if (x == 10 || x == 20 || x == 30) {
  println("failure");
} else if (y == 10 || y == 20 || y == 30) {
  println("failure");
} else if (z == 10 || z == 20 || z == 30) {
  println("failure ");
} else if (x + y + z == 30) {
  println("success!");
} else {
  println("failure");
 
}
