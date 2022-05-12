package Unit_01;

/*
 *3 Ways:
 *StringBuffer()
 *StringBuffer(String str)
 *StringBuffer(int capacity)
 *
 *StringBuffer is mutable unlike string
 */
public class P6_Task03_StringBufferClassInJava {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");
        System.out.println("Character at Position 0 is: "+sb.charAt(0));
        
        //StringBuffer class append() Method, now Original string is changed
        System.out.println("String 1st is: "+sb);
        
        //StringBuffer insert() Method
        StringBuffer sb2=new StringBuffer("Hello ");
        sb2.insert(1, "Java"); // now Original string is changed
        System.out.println("String 2nd is: "+sb2); //prints HJavaello
        
        //StringBuffer replace() Method
        StringBuffer sb3=new StringBuffer("Hello");
        sb3.replace(1, 3, "Java");
        System.out.println("String 3rd is: "+sb3); // prints HJavalo
        
        //StringBuffer delete() Method
        StringBuffer sb4=new StringBuffer("Hello");
        sb4.delete(1,3);
        System.out.println("String 4th is: "+sb4); // Prints Hlo
	}

}
