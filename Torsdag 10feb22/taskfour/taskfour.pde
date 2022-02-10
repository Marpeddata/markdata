// 4.a %% 4.b
for (int i = 0; i <= 20; i++) {
  if ((i%2) == 0) {
    println(i);
  }  
}

int start = 0;
int slut = 20;
int inc = 1;

//4.c
while(start <= slut) {
  if ((inc%2) == 0) {
  println(start);
  start = start + inc;
  }
}
