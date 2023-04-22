package constructor;

public class Sample {
         //User define Constructor
	     //without parameter Constructor
	
// Step 1 variable declaration
	int a;                           //NOTE: To call the constructor we have to only create an object
	int b;                                  // Example line no 27
// Step 2 variable initialization
	Sample(){
		a=3;
		b=7;
		int sum=a*b;
		System.out.println("addition is  "+sum);           
}
	public void addition() {
		int sum=a+b;
		System.out.println(sum);
	}
	public void multiplication() {
		int mul=a*b;
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
	Sample W= new Sample();   //with the help of this object we can call the constructor
	W.addition();             //calling to methods
	W.multiplication();        //calling to methods
	
}
	
}
