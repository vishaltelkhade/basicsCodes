package constructor;

public class Default_constructor1 {
public static void main(String[] args) {
	
	//default constructor
	
	Default_constructor1 Dc= new Default_constructor1();  //same class
	Dc.multiplication();
	Default_constructor V= new Default_constructor();  //different class
	V.addition();
	V.m1();
}
public void multiplication() {
	int a=4;
	int b=9;
	int mul=a*b;
	System.out.println(mul);
}
}
