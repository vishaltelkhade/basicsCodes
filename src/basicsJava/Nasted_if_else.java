package basicsJava;

public class Nasted_if_else {
public static void main(String[] args) {
	
	//greater number using nasted if else
	
	int a=3; int b=7; int c=1;
	
	
	if(a>b) {
		if(a>c) {
			System.out.println(a+ "  greater number");
		}
		else {
			System.out.println(b+ "  greater number");
		}
		
		
	}
	else {
		if(b>c){
			System.out.println(b+ "  greater number");
		}
		else {
			System.out.println(c + "  greater number");
		}
		
		
	}
}
}
