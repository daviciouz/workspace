//using constructors to immediately access objects

package project2017;

public class wife1 {
	private String wife1Name;
	
// constructor is like creating methods except we use the class name
	
	public wife1(String name){
		wife1Name=name;
	}
	
	public void saying(){
		System.out.println("Your wife name is " + wife1Name);
	}
}
