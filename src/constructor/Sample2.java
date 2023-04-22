package constructor;

public class Sample2 {
    //Step 1: Variable declaration
	
	String Name;
	 int Marks;
     char Grade;
     
  int a;
  int b;
  int c;
  Sample2(int a1,int b1){
	  a=a1;
	  b=b1;
	  c=a+b;
	  System.out.println(c);
  }
  
    //Step 2: Variable initialization with giving parameters
     
     Sample2(String name,int marks,char grade){
    	 Name=name;
    	 Marks=marks;
    	 Grade=grade;
     }
    
     
	public static void main(String[] args) {
		Sample2 V=new Sample2("Vishal",74,'A');
   	 System.out.println(V.Name+" "+V.Marks+" "+V.Grade);
   	Sample2 V1=new Sample2(30,40);
   	 
}
}
