package Unit_01;

	/* Problem Statement: P7_SwitchStatements: 
		   Create a switch statement [Manual], In Which:
			 a. When you pass 1 your program would print current year
			 b. When you pass 2 your program would print current month
			 c. When you pass 3 your program would print current day
			 d. When you pass 4 your program would print Not applicable 
	 * */

import java.util.Scanner;

public class P7_SwitchStatement {

			public static void main(String[] args) {
				 
				SwitchStatements obj = new SwitchStatements();
				obj.switchStatements();

			}

		}

		class SwitchStatements {
			void switchStatements() {
				try (Scanner sc = new Scanner(System.in)) {
					int num;
					System.out.println("Enter your Choice Between 1 to 3:");
					num=sc.nextInt();
					
					switch(num)
					{
					case 1:
						System.out.println("Current Year:2022");
						break;
					case 2:
						System.out.println("Current Month:April");
						break;
					case 3:
						System.out.println("Current Day:Thursday");
						break;
					default:
						System.out.println("Wrong Choice");
						
					}
				}
				
			}
		}