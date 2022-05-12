package Unit_01;

/*
 * When user takes input from the console:
 * 
 * nextLine() Read User input[to read Strings] next() Read next token from the
 * input entered by the user nextBoolean() Read a boolean value from the user
 * nextByte() Read a byte value from the user nextDouble() Read a double value
 * from the user nextFloat() Read a float value from the user nextInt() Read a
 * int value from the user nextLine() Read a String value from the user
 * nextLong() Read a long value from the user nextShort() Read a short value
 * from the user
 */

import java.util.Scanner;

public class P4_Task03_ScannerClassesInJava {



	public static void main(String[] args) {
			
			//Creating Scanner Object
			Scanner in = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
			
			//Read The First-Token:
			String firstname=in.next();
			System.out.println("Name is:  " + firstname + "\n");
			
			String name=sc.nextLine();
			String name2=sc.nextLine();
			
			System.out.println("Name is: " + name + "\n");
			System.out.println("Name is: " + name2 + "\n");
			
			boolean b=sc.nextBoolean();
			System.out.println(b + "\n");
			
			in.close();
			sc.close();

		}

}
