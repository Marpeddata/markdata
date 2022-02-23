class Main{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
   
   System.out.println(sum(5,6));
   System.out.println(upperC("hello"));
   System.out.println(isFirstLetCap("Mark"));
}



public static boolean iAmHappy()
{
  //2.a fillif out what is missing here: 
  if(happy)
  {

  return true;
  } else {
  return false;
}


}
//2.b
public static int sum(int a, int b) {
  return a+b;

}
//2.c
public static String upperC(String upC){
  return upC.toUpperCase();
}
//2.d
public static boolean isFirstLetCap(String word){
  if (Character.isUpperCase(word.charAt(0))){
      return true;
  }
  return false;
}


}
