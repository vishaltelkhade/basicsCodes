package constructor;

public class Sample3 {
    int a;
    int b;
    int sum;
    Sample3(int a1, int b1){
    	a=a1;
    	b=b1;
       
    }
    public void addition() {
    	sum=a+b;
    	System.out.println(sum);
    }
	
	public static void main(String[] args) {
		Sample3 N=new Sample3(30, 40);
		N.addition();
		Sample3 N1=new Sample3(345,34456);
		N1.addition();
}
}
