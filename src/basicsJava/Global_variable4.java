package basicsJava;

public class Global_variable4 {
	 int age=45;
	 String name="vishal";
public static void main(String[] args) {
	
   m1();
   m2();
}
public static void m1() {
	Global_variable4 n=new Global_variable4();
	
	
	System.out.println(n.age);
}
public static void m2() {
	Global_variable4 n=new Global_variable4();
	
	
	System.out.println(n.name);
}

}
