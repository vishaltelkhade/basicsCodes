package constructor;

public class Sample4 {
	String name;
	String model;
	int price;
	String engine;
	Sample4(String name1,String model1,int price1,String engine1)// with parameters
	{
		name=name1;
		model=model1;
		price=price1;
		engine=engine1;
	}
public static void main(String[] args) {
	Sample4 n=new Sample4("kia","nexon",140000,"automatic"); //<------object initialization
	System.out.println(n.name+" "+n.model+" "+n.price+" "+n.engine);
	Sample4 n1=new Sample4("Audi","B8",1800000,"automatic"); //<------object initialization
	System.out.println(n1.name+" "+n1.model+" "+n1.price+" "+n1.engine);
}
}
