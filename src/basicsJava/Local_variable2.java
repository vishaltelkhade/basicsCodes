package basicsJava;

public class Local_variable2 {
public static void main(String[] args) {
	
	//local variables in non static methods
	
	
	int i=60;                                  //local variable
	System.out.println(i);
	
	Local_variable2 lv=new Local_variable2();  //object creation
	lv.m1();                                   //calling to method
	lv.m2();                                   //calling to method
	
	
}
public void m1() {
	int b=36;                                  //local variable
System.out.println(b);	
}
public void m2() {
	int j=45;                                  //local variable
	System.out.println(j);
}
}
