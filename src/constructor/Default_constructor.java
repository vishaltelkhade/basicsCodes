package constructor;

public class Default_constructor {

	
	public static void main(String[] args) {
		Default_constructor dc=new Default_constructor();
		dc.m1();
		dc.addition();
}
	public void m1() {
		System.out.println("zero parameter method");
	}
	public void addition() {
		int a=3;
		int b=4;
		int sum=a+b;
		System.out.println(sum);
	}
	
}
