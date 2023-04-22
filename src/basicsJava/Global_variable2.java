package basicsJava;

public class Global_variable2 {
	static int i=30;             // Global variable
public static void main(String[] args) {
	System.out.println(i);
	m1();
	m2();
	m3();
	
}
public static void m1() {
	int i=67;              // local variable
	System.out.println(i);
}
public static void m2() {
	System.out.println(i);   // global variable
}
public static void m3() {
	int i=35;                 // local variable
	System.out.println(i);
}
}
