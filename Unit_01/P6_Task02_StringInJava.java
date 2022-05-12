package Unit_01;

public class P6_Task02_StringInJava {
	
		public static void main(String[] args) {
			
			StringInJava obj=new StringInJava();
			obj.StringDefinition();
			obj.charAndString();

		}

	}

	class StringInJava
	{
		void StringDefinition() {
			
			String s="Hello There!";
			String s1=new String("jdckhbsk");
			
			System.out.println("String s is = "+s);
			
			//Get length of a /string
			System.out.println("Length of String s is : "+s.length());
			
			//loop through a string!
			System.out.println("Character");
			for(int i=0;i<s.length();i++) {
				System.out.println(s.charAt(i));
			}
			
			String first="Akash";
			String second="Chauhan";
			
			//Add two Strings
			String third=first+second;
			System.out.println("Added String:"+third);
			
			//compare two strings
			boolean result1=first.equals(second);
			System.out.println("Wether Strings are Equal:"+result1);
			
			/*
			 * Java String are immutable
			 * In Java, the JVM maintain a string pool to store all of its strings inside the memory.
			 * The String pool helps in reusing the Strings.
			 *   If the String already exists. the new strings is not created.
			 *   Instead, the new reference, example points to the already existed string (Java).
			 *   If the string dosen't exist, the new string(Java is created)
			 */
			
			String fourth="Akash";
			String fifth=new String("Chauhan");
		}
		/*
		 * Characters Array are mutable but Strings are not
		 */
		
		void charAndString() {
			
			char[] ch= {'H','e','l','l','o',' ','T','h','e','r','e','!'};
			char[] ch2= {'!','!'};
			
			System.out.println(ch);
			
			for(int i=0;i<ch.length;i++) {
				System.out.println(ch[i]);
			}
			
			String s1=new String(ch);
			System.out.println(s1);
			
		    // Characters Array are mutable but Strings are not!
			ch[0]='h';
			
			//s1.charAt(0)='h';
			
			/*
			 * Join Two Java Strings-'+' can be used to append strings together to form a
			 * new string-but not possible in char array
			 */
			
			s1=s1+'a'; // s1 is new object with new memory
			//ch=ch+ch2;
			
			//String to char array
			String s2="GEEKS";
			char[] ch4=s2.toCharArray();
			
			//char array to String
			char[] a2= {'A','K','A'};
			String s3=new String(a2);
		}
	}
