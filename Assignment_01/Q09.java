package Assignment_01;

public class Q09 {

		public static void main(String[] args) {
			
			System.out.println("Question 09");
			System.out.println("Vivek Sati_F_20011773");
			System.out.println("\t");
			
			AnotherClass obj = new AnotherClass();
			obj.showData();
			obj.accessData();

		}

	}

	// You can make a class Public or leave it default or make it abstract or final but you cannot make a class private or protected...

	private class rom //Illegal modifier for the class rom; only public, abstract & final are permitted
	{
		//
	}

	//But you can make variables -> public, private, protected or default its up to you according to your need...




	class ParentClass{
		int a = 10;//Default protection!
		public int b = 20;//Can be accessed outside Unit02 package within same project
		protected int c = 30;//Can only accessed only within unit02 package
		private int d = 40;//Within Parent class only , not even in the subclass
		
		void showData() {
			System.out.println("Inside ParentClass");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
		}
	}

	class ChildClass extends ParentClass{
		
		void accessData() {
			System.out.println("Inside ChildClass");
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
		}
	}

	class AnotherClass extends ChildClass{
		
		void Display() {
			ParentClass obj = new ParentClass();
			System.out.println(obj.a);
			System.out.println(obj.b);
			System.out.println(obj.c);

	}

	}
