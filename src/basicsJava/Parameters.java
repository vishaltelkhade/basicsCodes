package basicsJava;

public class Parameters {
public static void main(String[] args) {
//zero parameter
	addition();
	
	addition1(3,4);
	Studentinfo("vishal",92,'A',92.3f);
	
	Studentinfo("vaman",55,'B',55.7f);
	
	Studentinfo("RAM",66,'C',33.6f);
	
	addition1(78,66);
	
ParametersNS r=new ParametersNS();
r.v1();
r.v2();
addition();
Parameters.addition();
	
	
	
	
	
	
	
}
public static void addition() {
	int a=34;
	int b=22;
    int c=a+b;
	System.out.println("addition of two nos= "+c);
}
public static void addition1(int x,int y ) {
	int z=x+y;
	System.out.println("addition of two nos with parameters= "+z);
}
public static void Studentinfo(String studentname,int smarks,char sgrade, float spercentage ) {
	System.out.println("student name: "+studentname);
	System.out.println("student marks: "+smarks);
	System.out.println("student grade: "+sgrade);
	System.out.println("student percentage: "+spercentage);
	
}
}
