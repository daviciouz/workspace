package example4;

public class createStudent {
	public static void main(String[] args){
		
		// create an instance of a student class using the student constructor
		student s1 = new student();
		
		s1.sid = 1234;
		s1.fullname = "John Smith";
		
		student s2 = new student();
		
		s2.sid = 3456;
		s2.fullname = "Megan Fox";
		
		System.out.println(s1.sid);
		
	}

}
