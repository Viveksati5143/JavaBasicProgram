package Unit_01;

public class P2_Task02_ConstantsInJava {

	public static final int a=10;
	final double pi = 3.14
	public static void main(String[] args) {
		int b=1;
		System.out.println(a);
		//Cannot make a static reference to the non-static field pi
		System.out.println(pi);
		//Cannot make a static reference to the non-static method main() from the type 
		//P2_Task02_ConstantsInJava
		main();
	}

	public void main() {
		System.out.println(a);
		//b cannot be resolved to a variable
		System.out.println(b);
	}
}