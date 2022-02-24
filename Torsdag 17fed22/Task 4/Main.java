public class Main{

	public static void main(String[]args) 
	{
	int[] intArr = new int [] {2,3,4,5,6,7,8};
	String[] stringArr = new String[] {"1","2","3","4","5"};
	//boolean[] booleanArr = new boolean[];	
	String[] stringXo = new String[] {"1","3","4","5","5"};
	
	stringRes(stringArr);
	stringRes(stringXo);
	System.out.print(intRes(intArr));	
	System.out.println(intAvg(intArr));

	}
	
	public static void stringRes(String[] loopArr) 
	{

	for(int i = 0; i < loopArr.length; i++) {
			System.out.print(loopArr[i]);
		}
	}
	public static int intRes(int[] loopArr1) {
	int sum = 0;
	for(int i = 0; i < loopArr1.length; i++) {
		sum += loopArr1[i];	
	
	}	return sum;
}
	public static int intAvg(int[] loopArr2) {
	int sum = 0;
	for(int i = 0; i < loopArr2.length; i++) {
		sum += loopArr2[i];	
	
	}	return sum/loopArr2.length;
}



}