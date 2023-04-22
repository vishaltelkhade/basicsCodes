package basicsJava;

public class GV_calling_different_class {
public static void main(String[] args) {
	
	//Static Global variables calling from different class
	
	System.out.println(Global_variable3.name);
	System.out.println(Global_variable3.i);
	
	Global_variable3 Gv=new Global_variable3();
	Gv.m1();
	Gv.m2();
}
}
