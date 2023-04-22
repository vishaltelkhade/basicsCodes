package basicsJava;

public class Variables {
public static void main(String[] args) {
	//syntax : Datatype variable name;
	
	int marks;           // variable declaration (Allocating/reserving memory)
	String Studentname;  // variable declaration (Allocating/reserving memory)
    char grade;          // variable declaration (Allocating/reserving memory)
    float Percentage;    // variable declaration (Allocating/reserving memory)
    
    // syntax:variable name="variable information";
    
     
     marks=65;             // variable initialization (Assigning/inserting value)
     Studentname="Vishal"; // variable initialization (Assigning/inserting value)
     grade='A';            // variable initialization (Assigning/inserting value)
	 Percentage=92.3f;     // variable initialization (Assigning/inserting value)
	
	System.out.println("Marks= "+marks );       //usage
	System.out.println("Name :"+Studentname);   //usage
	System.out.println("Grade= "+grade);        //usage  
	System.out.println("Percentage= "+Percentage);
}
}
