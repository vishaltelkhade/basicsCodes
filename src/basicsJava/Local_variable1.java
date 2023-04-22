package basicsJava;

public class Local_variable1 {
	public static void main(String[] args) {
		//local variable with a different name
		
		int i=5;           // local variable from main method body
		System.out.println(i);
		
		m1();           //calling to methods
		m2();           //calling to methods
		m3();           //calling to methods
	}
	public static void m1() {
		int a=3;                //local variable
		System.out.println(a);
	}
	public static void m2() {
		int b=7;                //local variable
		System.out.println(b);
	}
	public static void m3() {
		int c=9;                  //local variable
		System.out.println(c);
	}
}
