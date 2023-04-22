package basicsJava;

public class Non_static_Global_variable1 {
	
	
	//non static global variable calling from same class
	
	int age=26;
	String name= "vishal";
public static void main(String[] args) {
	Non_static_Global_variable1 Ns=new Non_static_Global_variable1();
	System.out.println(Ns.age);
	System.out.println(Ns.name);
	
	Non_static_Global_variable1 Ns2=new Non_static_Global_variable1();
	Ns2.m1();
}

public void m1() {
	Non_static_Global_variable1 Ns1=new Non_static_Global_variable1();
	System.out.println(Ns1.age);
	System.out.println(Ns1.name);
}

}
