package basicsJava;

public class NS_different_class {
	int age=65;
	String name ="Vaman budeba";
	int age1=75;
	String name1= "bhimrao";
	
public static void main(String[] args) {
	Non_static_Global_variable1 DC=new Non_static_Global_variable1();
	System.out.println(DC.age);
	System.out.println(DC.name);
	
	m1();
	m2();
	
	
}
public static void m1() {
	Non_static_Global_variable1 DC=new Non_static_Global_variable1();
	System.out.println(DC.age);
	System.out.println(DC.name);
	NS_different_class DC1=new NS_different_class ();
	System.out.println(DC1.age);
	System.out.println(DC1.name);
}
public static void m2() {
	NS_different_class DC1=new  NS_different_class ();
	System.out.println(DC1.age1);
	System.out.println(DC1.name1);
}
}
