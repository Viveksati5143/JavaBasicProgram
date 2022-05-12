package Assignment_01;

import java.util.*;

public class Q08 {
	
		public static void main(String[] agrs) {
			
			System.out.println("Question 08");
			System.out.println("Vivek Sati_F_20011773");
			System.out.println("\t");
			
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the size of array:");
			int n=in.nextInt();
			int arr[]=new int[n];
			
			System.out.println("Enter the Element of array:");
			for(int i=0;i<n;i++) {
				arr[i]=in.nextInt();
			}
			
			int m;
			System.out.println("Enter the index whose element is to be deleted");
			m=in.nextInt();
			
			System.out.println("Deleted Element="+arr[m]);
			
			for(int i=m;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			
			System.out.println("Array after the number is deleted");
			for(int i=0;i<n-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

