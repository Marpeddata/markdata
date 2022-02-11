//6.a
int a = (int)random(0,11);
int b = (int)random(0,11);
//String result = "";
int x = 1;
int y = 10;
int z = 8;

if (a == 10 || b == 10) {
  //result = "success";
  println("success");
} else if (a + b == 10) {
  //result = "success";
  println("success");
} else {
  println("failure!");
  //result ="failure!";
}

//println(result);


//6.b

/*if (x + y + z == 30 && x % 10 != 0 && y % 10 != 0 && z % 10 != 0) {
println("success");
} else {
println("faliure");
}

if(x + y + z == 30) {
  if(x % 10 != 0 && y % 10 != 0 && z % 10 != 0) {
    println("success");
  } else {
    println("failure");
  }

*/


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
