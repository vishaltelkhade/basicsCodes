package basicsJava;

public class Global_variable {
	static int i=5;         //global variable
	static String name= "vishal";
public static void main(String[] args) {
	int i=6;  // local variable
	System.out.println(i);
	System.out.println(name);
	m1();
	m2();
	Global_variable Gv=new Global_variable();
	Gv.m3();
}
public static void m1() {
	
	System.out.println(i);
	System.out.println(name);
}
public static void m2() {

	System.out.println(i);
	System.out.println(name);
}
public void m3() {
	System.out.println(i);
	System.out.println(name);
}
}
