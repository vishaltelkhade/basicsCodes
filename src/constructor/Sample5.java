package constructor;

public class Sample5 {
int a;
int b;
String c;
Sample5(){//<------without parameter
	a=4;
	b=6;
}
Sample5(int a1,int b1){
	a=a1;
	b=b1;
}
Sample5( String name){
	
	c=name;
}
public void addition() {
	int sum=a+b;
	System.out.println(sum);
}
public void multiplication() {
	int mul=a*b;
	System.out.println(mul);
}
public void Name() {
	System.out.println(c);
}
public static void main(String[] args) {
	Sample5 s5=new Sample5();   //
                                //   } <------Zero parameters calling
	s5.addition();             //
	Sample5 s6=new Sample5(30,40);
	s6.addition();
	Sample5 s7=new Sample5(6,7);
	s7.multiplication();
	Sample5 s8=new Sample5("vishal");
	s8.Name();
	
	
}
}
