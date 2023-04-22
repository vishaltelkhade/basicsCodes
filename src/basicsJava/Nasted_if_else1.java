package basicsJava;

public class Nasted_if_else1 {
public static void main(String[] args) {
	// eligible criteria for Navy force exam using nasted if else program
	
	float height=5.8f;
	int marks=65;
	int swim_speed=18;
	
	if(height>=5.5 && height<=5.7) {
		if(marks>=65 && swim_speed>=20){
			System.out.println("you are eligible for the NAVY exam");
		}
		else {
			System.out.println("you are NOT eligible for the NAVY exam");
		}
	}
	else {
		System.out.println("you are not eligible for the navy exam");
		}
	}
	
}

