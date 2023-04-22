package basicsJava;

public class Local_variable {
public static void main(String[] args) {
	
	//local variable with a same name
	
	int a=5;
	System.out.println(a);   //local variable
	               /*DEFINATION:

	        	    LOCAL VARIABLE : 
	        	    
	        	    local variable is the variable which is declare inside the method body.
	        	    
	        	    - The scope of the local variable within that inside the method body only.
	        	    - we can repeat the varible name inside the different method body */
	
	m1(); // calling the method          
	m2(); // calling the method
	
}
public static void m1() {
     int a=3;                  // local variable
	
	System.out.println(a);	
}
public static void m2() {
     int a=2;                   // local variable
	
	System.out.println(a);	
}
}
