package basicsJava;

public class NSMethod2 {
public static void main(String[] args) {
	//object creation
	//syntax
	//classname RV = new classname
	NSMethod1 v= new NSMethod1();
	v.M1();
	v.M2();
	
	//call from same class
	
	NSMethod2 v1 = new NSMethod2();
	v1.M3();
	v1.M4();
	Static1 v2=new Static1();


	
	
	
	
	
	v2.s1();
	
	
}
public void M3() {
	System.out.println("I AM FROM THE SAME CLASS NSMethod2:M3");
}
public void M4() {
	System.out.println("I AM FROM THE SAME CLASS NSMethod2:M4");
}
}
