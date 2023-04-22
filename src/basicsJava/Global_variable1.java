package basicsJava;

public class Global_variable1 {
	static int i=3;
public static void main(String[] args) {
	System.out.println(i);      // i=3
	
	Global_variable1 Gv=new Global_variable1 ();
	Gv.m1();
	Gv.m2();
	Gv.m3();
}
public void m1() {
	 i=45;                       //i=45 now this value store to a global variable
	System.out.println(i);
}
public void m2() {
	
	System.out.println(i);        //i=45 this is because one variable can store one information at a time
}
public void m3() {
	 i=67;
	System.out.println(i);        //i=67      
	
}
}

// note if we use int data type in local method then those varible act like a local variabble..

// o/p:
/* 3
   45
   3
   67 */

// if they dont have data type in local method then those variable act like global variables

// o/p:
/* 3
   45
   45
   67  */


