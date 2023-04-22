package basicsJava;

public class If_else_if {
public static void main(String[] args) {
	
	//student marks position status using if_else_if progam
	
	
	
	int marks=101;
	if(marks>=45 && marks<=50) {
		System.out.println(" you have pass this year");
	}
	else if(marks>=51 && marks<=59) {
		System.out.println("congratulations you have pass this year with good marks");
	}
	else if(marks>=60 && marks<=70) {
		System.out.println("woww you have got first class");
	}
	else if(marks>=71 && marks<=90) {
		System.out.println("woww you have got distinction");
	}
	else if(marks>=91 && marks<=100) {
		System.out.println("Congratulations you are topper this year");
	}
	else if(marks>100) {
		System.out.println("invalid input enter the valid marks");
	}
	else {
		System.out.println("you are failed try next year");
	}
		
}
}
