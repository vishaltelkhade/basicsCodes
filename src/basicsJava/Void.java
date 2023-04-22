package basicsJava;

public class Void {
public static void main(String[] args) {
	int sum1=add(4,5);
	System.out.println(sum1);
	m1();
	
}
public static int add(int a, int b) {
	int sum=a+b;
	System.out.println(sum);
	return sum;
}
public static void m1() {
	System.out.println(add(9,8));
}
}
