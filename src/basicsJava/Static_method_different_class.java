package basicsJava;

public class Static_method_different_class {
public static void main(String[] args) {
	//calling from different class
	
	//syntax
	//classname.method name();<-----method name and class name are fromm differnt classes
	
	StaticMethod_calling_from_different_Class.demo5();
	StaticMethod_calling_from_different_Class.demo6();
	Static_method_different_class.m1();
	
	Static_Method.Demo1();
	Static_Method.Demo2();
}
public static void m1() {
	System.out.println("hello java");
}
}
