package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {


	static int a = 10;
	int b = 20;
	
	public static void main(String args[])
	{
		
		System.out.println(a);
		
		//Cannot make a static reference to the non-static field b
		//System.out.println(b);
		TypeConversionAndTypeCasting();
	}
	
	static void TypeConversionAndTypeCasting()
	{
		//System.out.println(b);
		System.out.println(a);
		
		double d;
		int i = 20;
		
		d=i; //Type Conversion
		System.out.println(d);
		System.out.println(i);
		
		double g = 30;
		int j;
		j = (int)g; //Type Casting
		
		// 32 bits = 64 bits
		System.out.println(j);
		
		
		
	}
}