package constructor;

public class Sample1 {
         //User define constructor
	     //zero parameter
	
	//Step 1: Variable Declaration
	   int marks;
	   char Grade;
	   String Name;
	//Step 2: Variable Initialization By Creating Constructor  
	  public  Sample1(){                                                     //this is constructor from line 12 to 17
		   marks=65;
		   Grade='A';
		   Name="vishal";
		   System.out.println("Student marks = "+marks+"  "+"Student Grade = "+Grade+"  "+"Student Name = "+Name );
	   }
	   public  void Studinfo() {                                    //non static method
		   System.out.println("Student marks = "+marks);
		   System.out.println("Student Grade = "+Grade);
		   System.out.println("Student Name = "+Name);
		}
	
	public static void main(String[] args) {
		Sample1 s1= new Sample1();              //we can use this object as a calling for a constructor
                                                // we dont need to call the constructor it is automatically called by object only
		
		s1.Studinfo() ;                       //this is for calling the method
}
}
