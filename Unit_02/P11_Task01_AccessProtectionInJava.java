package Unit_02;

public class P11_Task01_AccessProtectionInJava {

		public int a=10;
		
		public static void main(String[] args) {
			
			ChildClass obj=new ChildClass();
			obj.showData();
			obj.accessData();

		}

	}

	class ParentClass{
		
		int a=10; // default protection!
		public int b=20; // can be accessed outside Unit02 Package but within same project
		protected int c=30; // can only be accessed within Unit02 Package
		private int d=40; // within ParentClass only,not even in its sub-Class
	     
		void showData() {
			System.out.println("Inside ParentClass");
			System.out.println("Value of 'a' in ParentClass = " + a);
			System.out.println("Value of 'b' in ParentClass = " + b);
			System.out.println("Value of 'c' in ParentClass = " + c);
			System.out.println("Value of 'd' in ParentClass = " + d);
		}
	}

	class ChildClass extends ParentClass{
		
		void accessData() {
			ParentClass obj=new ParentClass();
			System.out.println("\n");
	        System.out.println("Value in Extented Class");
			System.out.println("Value of 'a' in ChildClass extended from ParentClass= "+obj.a);
			System.out.println("Value of 'b' in ChildClass extended from ParentClass= "+obj.b);
			System.out.println("Value of 'c' in ChildClass extended from ParentClass= "+obj.c);
			//System.out.println(obj.d); // private number cannot be accessed
		}
		
	}

	class AnotherClass{
		void display() {
			ParentClass obj=new ParentClass();
			System.out.println(obj.a);
			System.out.println(obj.b);
			System.out.println(obj.c);
		}
	}
