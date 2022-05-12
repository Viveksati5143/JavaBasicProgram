package Unit_01;

	/* Problem Statement:

	P8_String: 

	(Create separate logic in separate function)

	F1 - Check the entered string is palindrome or not? 
	  		String s = "75457"
	  		Output: Yes it is a palindrome or No it is not a palindrome.

	F2 - Make a reverse of a string using?
	F3 - String Compare: Check if the strings are equal or not?

	 * */

public class P8_String {

		public static void main(String[] args) {

			QuestionsOnString obj = new QuestionsOnString();

			String s1 = new String("75457");
			String s2 = new String("7545a");

			obj.palindromeOrNot(s1);
			obj.reverseOfAString(s2);
		    obj.stringEqualOrNot(s1, s2);

		}

	}

	class QuestionsOnString {

		void palindromeOrNot(String s) {
			String st1="";
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				st1=ch+st1;	
			}
			System.out.println(st1);
			int flag=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==st1.charAt(i))
				flag++;	
			}
			if(flag==s.length() && flag==st1.length())
			    System.out.println("Number is Palindrome");
			else
				System.out.println("Number is not Palindrome");
			
		}

		void reverseOfAString(String s) {
			String st1="";
			System.out.println("\n");
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				st1=ch+st1;	
			}
			System.out.print("Reverse String: "+st1);

		}
		
		void stringEqualOrNot(String s1,String s2) {
		   int flag=0;
			System.out.println("\n");
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				flag++;	
			}
			if(flag==s1.length() && flag==s2.length())
			    System.out.println("Strings are equal");
			else
				System.out.println("Strings are not equal");
		}
	}
