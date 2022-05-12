package Unit_01;

public class P5_Task02_MethodsInJava {
		
		public static void main(String[] args) {
			
			ABC3 obj=new ABC3();
			
			//Calling Display method definition
			obj.display();
			System.out.println("Value of 'a' in main method="+obj.a);
			
		}

	}

	class ABC3 {
		
		static int a=10;
		
		/*
		   Actual method definition
		   DataType methodName(DataType2 p1, DataType2 p2){
		     
		   methodBody;
		   
		   return value; //if required
		     
		   }
		 */
		static void display() {
			
			int b=10;
			int a=10;
			System.out.println("Value of b="+b);
			System.out.println("Value of a="+a);
		}
		
		int display2() {
			
			System.out.println("Value of a in display2="+a);
			//As a was a local variable so we can not access it outside the method
			//System.out.println(b);
			
			return a;
		}
	}