public class Datamatik{
			


	public static void main(String[]args) 
	{
		Student st[] = new Student[10];
		
		st[0] = new Student("Mark", 78, false, "Stud : 1");
		st[1] = new Student("Mayas", 78, false, "Stud : 2");
		st[2] = new Student("Foss", 78, false, "Stud : 3");
		st[3] = new Student("Isak", 78, false, "Stud : 4");			
		st[4] = new Student("Veronica", 78, true, "Stud : 5");
		st[5] = new Student("Villiam", 78, false, "Stud : 6");
		st[6] = new Student("Felicia", 78, true, "Stud : 7");
		st[7] = new Student("Lucas", 78, false, "Stud : 8");
		st[8] = new Student("Marcus", 78, false, "Stud : 9");
		st[9] = new Student("Nikolaj", 78, false, "Stud : 10");

		System.out.print(getStud(st,2));
		System.out.print(findStud(st,"Lucas"));

	}
	public static String getStud(Student[] arr1, int a) {
			return arr1[a-1].getName();
			
		
	}

	public static int findStud(Student[] arr2, String a) {
			int foundIndex = 1;
			for(int i = 0; i < arr2.length; i++) {
			if(arr2[i].name.equals(a)) {
				foundIndex = i;
			}
				
				
			}
			
			return foundIndex;
		}

}