// Constructor methods take the same name as the class. Add the following constructor to your StudentResults class:

// Because we've made the field variables private, we need another way to assign values to them. One way to do this 
// is with something called a constructor. This is a method you can use to set initial values for field variables. 
// When the object is created, Java calls the constructor first. Any code you have in your constructor will then get 
// executed. You don't need to make any special calls to a constructor method - they happen automatically when you create a new object.

package exams;

public	class StudentResults{

	private String Full_Name;
	private String Exam_Name;
	private String Exam_Score;
	private String Exam_Grade;

// This constructor definition
// So the name of the constructor is StudentResults. This is exactly the same name as the class itself. Unlike normal methods,
// class constructors don't need a return type like int or double, nor any return value. You can, however, pass values over to your constructors. 
//If we want to pass values over to our field variables, we can do this:

	StudentResults(String name, String grade){

		Full_Name = name;
		Exam_Grade = grade;

// Here, we've added two String variables to the round brackets of the constructor. Inside the curly brackets we've assigned these values to the 
// Full_Name and Exam_Grade fields. When you create a new object, you'd then need two strings between the round brackets of the class name:

// When the object is created, the values "Bill Gates" and "A" will be handed over to the constructor.
	
	StudentResults aStudent = new StudentResults( "Bill Gates", "A" );

	}
}

// However, it's a good idea to just set some default values for your field variables. These values will then be assigned when the object is created.
// Add the following to your constructor:
// Alternatively We could have define constructor with default values as

StudentResults(String name, String grade){

		Full_Name = "Stephen Osei-Akoto";
		Exam_Name = "Algorithm 5515";
		Exam_Score = "96"
		Exam_Grade = "A";


}

