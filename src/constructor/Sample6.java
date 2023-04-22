package constructor;

public class Sample6 {
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
