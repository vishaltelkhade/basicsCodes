package basicsJava;

public class Global_variable3 {
	//Global variables call from same class
	
	static String name="Vishal";
	static int i=89;
public static void main(String[] args) {

	System.out.println(name);
    System.out.println(i);


Global_variable3 Gv=new Global_variable3();
	Gv.m1();
	Gv.m2();
	
	
	
}

  public void m1() {
	 System.out.println(name);
	 System.out.println(i);
 }
  public void m2() {
	System.out.println(name); 
	System.out.println(i);
  }
}
