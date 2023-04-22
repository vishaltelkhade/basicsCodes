package basicsJava;

public class Nonstaticmethod1 {
	String name ="Rahul";   //Non static global variable
	public static void main(String[] args) {

		Nonstaticmethod1 N=new Nonstaticmethod1();
		System.out.println(N.name);
		
		
		N.m1();
		
		
		
		
				
	}
	
	
	public void m1() {
		Nonstaticmethod1 N1=new Nonstaticmethod1();
		
	String name= "Patil";
	System.out.println(name);	
	System.out.println(N1.name);
	System.out.println(this.name);
		
	}


}
