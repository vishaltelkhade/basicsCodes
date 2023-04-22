package basicsJava;

public class Non_static_Global_variable {
	
	//non static global variable calling from same class
	
	String name="vishal";
	int age=25;
	float percentage=65.3f;
public static void main(String[] args) {
	
	
	Non_static_Global_variable Ns=new Non_static_Global_variable();    //scope of the reference                                                                  //the scope of the reference 
	System.out.println(Ns.name);                                      //variable within the body only
	System.out.println(Ns.age);
	
	m1();
	m2();
	
}
public static void m1() {
	Non_static_Global_variable Ns1=new Non_static_Global_variable ();
	System.out.println(Ns1.name);
	System.out.println(Ns1.age);
	System.out.println(Ns1.percentage);
}
public static void m2() {
	Non_static_Global_variable Ns1=new Non_static_Global_variable ();
	System.out.println(Ns1.name);
	System.out.println(Ns1.age);
	System.out.println(Ns1.percentage);
}
}
