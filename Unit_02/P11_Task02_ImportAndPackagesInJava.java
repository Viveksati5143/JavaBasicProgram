package Unit_02;

	/*
	 * A Java package is a group of similar types of classes, interfaces and sub-packages.
	 * Package in java can be categorized in two form
	 *   1.built-in package(lang, awt, javax, swing, net, io, util, sql)
	 *   2.user-defined package
	 *   
	 * Package also helps to avoid class name collisions
	 * Package also helps us to maintain access protection in Java
	 * Package are named in reverse order of domain names
	 *   unit01.javaproject.com->"com.javaproject.unit01"
	 *   
	 * import java.util.vector; //Import the Vector class from util package
	 * import java.util.*; //import all the classes from util package
	 * 
	 * Static Import:
	 *   Static Import is a features introduced in Java programming language(Version 5 and above)
	 *   that allows members(Fields and methods) defined in a class as public static
	 *       to be used in java code without specifying the class in which the field is defined     
	 */

	import static java.lang.System.*;
	import static java.lang.Math.*;

	//import Unit01.SampleClass1;
	public class P11_Task02_ImportAndPackagesInJava {
		public static void main(String[] args) {
			
			out.println("Welcome to Package");
			
			out.println(sqrt(4));
			System.out.println(pow(2,2));
			System.out.println(abs(6.3));
			
			/*SampleClass1 obj=new SampleClass1();
	        System.out.println(obj.a);*/  
		}

	}
