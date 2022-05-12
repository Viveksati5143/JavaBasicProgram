package Unit_01;

public class P4_Task01_ControlAndConditionalStatementsInJava {

	/*
	 * Control Statements and Conditional Statements:
	 * Java provides three types of control flow statements.
	 * Decision Making Statements 
	 *   if Statements
	 *   switch statement
	 *   
	 *Loop Statements
	 *   do while loop
	 *   while loop
	 *   for loop
	 *   for-each loop
	 *   
	 *Jump Statements
	 *   break statement 
	 *   continue statement    
	 */

		public static void main(String[] args) {
	 
			Statements obj = new Statements();
			
			obj.DecisionMakingStatements();
			obj.LoopStatements();
			obj.JumpStatements();
	   }
		
	}

	class Statements{
		
		void DecisionMakingStatements() {
			
			int x=10;
			int y=12;
			if(x + y < 10)
			{
				System.out.println("x + y is less than 10");
			}
			else
			{
				System.out.println("x + y is greater than 20");
			}
			
			int num=2;
		   
			 //Switch (expression)
			switch(num) {
			case 0:
				System.out.println("Number is 0");
				break;
			case 1:
				System.out.println("Number is 1");
				break;
			default:
			    System.out.println(num);		
			}
		}
		
		void LoopStatements() {
			
			/*
			 * for(initialization,condition,increment/decrement) { //block of statements }
			 * for(data_type var: array_name/collection_name) { //statements }
			 */
			
			// for Loop
			
			int sum=0;
			for(int j=1;j<=10;j++) {
				sum=sum+j;
			}
			System.out.println("The sum of first 10 natural numbers is"+sum);
			
			//For Each
			String[] names= {"Java","C","C++","Python","JavaScript"};
			System.out.println("Printing the contents of the array names:\n");
			for(String name : names) {
				System.out.println(name);
			}
			
			/*
			 * while(condition) {//Looping statements}
			*/
			System.out.println("\n");
			int i=0;
			System.out.println("Printing the list of first 10 even numbers \n");
			while(i<=10) {
				System.out.print(i+" ");
				i=i+2;
			}
			
			/*
			 * do-while do {//Statements} while (condition);
			*/
			System.out.println("\n");
			i=0;
			System.out.println("Printing the list of first 10 even numbers \n");
			do {
				System.out.print(i+" ");
				i=i+2;
			}while(i<=10);
		}
		
		void JumpStatements() {
			
			//Break
			System.out.println("\n");
			for(int i=0;i<=10;i++) {
				System.out.print(i+" ");
				if(i==6) {
					break;
				}
				System.out.print(i+" ");
			}
			
			//Continue
			System.out.println("\n");
			for(int i=0;i<=10;i++) {
				if(i==6) {
					continue;
				}
				System.out.print(i+" ");
				}
			}
		}
