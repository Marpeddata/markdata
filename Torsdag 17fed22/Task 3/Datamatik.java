public class Datamatik{
			


	public static void main(String[]args) 
	{

		Teacher tobias = new Teacher("Tobias", 78, false);
		Student mark = new Student("Mark", 78, false, "Studerende");
		Student mayas = new Student("Mayas", 78, false, "Studerende");

		System.out.println(tobias.getName());	
		System.out.println(mark.getName() + " " + mark.getTeam());
		System.out.println(mayas.getName() + " " + mayas.getTeam());	
		
	}
	
}