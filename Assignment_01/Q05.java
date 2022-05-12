package Assignment_01;

import java.util.Scanner;
public class Q05 {

	public static void main(String[] args) {
		
		System.out.println("Question 05");
		System.out.println("Vivek Sati_F_20011773");
		System.out.println("\t");
		
		Employee arr[] = new Employee[8];
		String s;
		int age;
		String depart;
		int salary;
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Enter the detail of "+(i+1)+" Employee");
			s = in.nextLine();
			age = in.nextInt();
			depart = in.next();
			salary = in.nextInt();
			
			arr[i] = new Employee(s, age, depart, salary);
			
		}
		//check total salary
		Employee result = new Employee();
		result.total_salary();
		
	}

}

class Employee
{
	String name;
	int age;
	String Department;
	int salary;
	static int total_sal = 0;
	
	Employee()
	{
		//Default one
	}
	Employee(String s, int a, String depart, int sal)
	{
		name = s;
		age = a;
		Department = depart;
		if(sal > 30000)
		{
			salary = 25000;
		}
		else
		{
			salary = sal;
		}
		total_sal += sal;
	}
	
	void total_salary()
	{
		System.out.println("Total salary is "+total_sal);
	}
	
}