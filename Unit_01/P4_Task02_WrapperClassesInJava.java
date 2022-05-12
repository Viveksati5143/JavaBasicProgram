package Unit_01;

public class P4_Task02_WrapperClassesInJava {

	/*
	 * The Wrapper class in Java provides the mechanism to convert primitives into object
	 * Why?
	 * Because we want to use predefined methods of those objects
	 *   boolean data types -> Boolean obj; -> obj.toString();
	 */

		public static void main(String[] args) {
			
			//Converting int into Integer
			int a=20;
			
			String s=""+a+"";
			
			//Converting int into Integer explicitly
			Integer i=Integer.valueOf(a);
			
			//Autoboxing, now complier will write Integer, valueOf(a) internally
			Integer j=a;

			System.out.println(a +" "+ i +" " + j);
			
			System.out.println(i.toString());
			
			//a.toString() can not be done due to a is int not object
			
			//Autoboxing: Converting primitives into objects
			byte b=10;
			Byte byteobj=b;
			
			System.out.println(byteobj);
			
			//Unboxing: Converting Objects To Primitives
			byte bytevalue=byteobj;
			System.out.println(bytevalue);
		}

	}
