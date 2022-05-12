package Assignment_01;

public class Q04 {


		public static void main(String[] agrs) {
	    
			System.out.println("Question 04");
			System.out.println("Vivek Sati_F_20011773");
			System.out.println("\t");
			
			System.out.println("Call Made For Parameterized Constructor");
			ClassThree obj =new ClassThree(1);
	        
			System.out.println("\n");
			System.out.println("Call Made for Non-Parametrized Constructor");
	        ClassThree obj1=new ClassThree();
	   
		}
	}

	class ClassOne{
		
		ClassOne(int a){
		
			System.out.println("One's Parameterized Constructor");
		}
	}

	class ClassTwo extends ClassOne{
		
		ClassTwo(){
			super(1);
			System.out.println("Two's Default Constructor");
		}
	}

	class ClassThree extends ClassTwo{
		
		ClassThree(){
		
			System.out.println("Three's Default Constructor");
		}
		
		ClassThree(int b){
			
			System.out.println("Three's Parameterized Constructor");
		}
	}