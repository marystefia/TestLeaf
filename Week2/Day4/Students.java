package week2.day4;

public class Students {

	public static int id = 1120;
	public void studentInfo(int id) {
		System.out.println("Student ID: "+ id);
		System.out.println("Name: Antony");
		System.out.println("Grade: 6");
		System.out.println("Phone No: 9090909090");
		System.out.println("Email: anto@gmail.com \n");
	}
	
	public void studentInfo(int id, String name) {
		System.out.println("Student ID: "+ id);
		System.out.println("Name: "+ name);
		System.out.println("Grade: 6");
		System.out.println("Phone No: 9090909090");
		System.out.println("Email: anto@gmail.com \n");
	}
	
	public void studentInfo(String email, long phno) {
		System.out.println("Student ID: "+ id);
		System.out.println("Name: Antony");
		System.out.println("Grade: 6");
		System.out.println("Phone No: "+ phno);
		System.out.println("Email: "+ email);
	}
	
	public static void main(String[] args) {
		
		Students student = new Students();
		student.studentInfo(id);
		student.studentInfo(id, "Antony");
		student.studentInfo("anto@gmail.com", 9090909090l);
	}

}
