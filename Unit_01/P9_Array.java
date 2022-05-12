package Unit_01;

/* Tasks given below:
obj.sortAnArray(array);
obj.findTheDuplicateElements(array);
obj.findSecondLargestAndSecondSmallestElement(array);
obj.leftRotationInAnArray(array); 
obj.removeElementInArray(array);//(Optional)
*/

import java.util.Scanner;

public class P9_Array {


		public static void main(String[] args) {

			int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

			QuestionsOnArray obj = new QuestionsOnArray();
			obj.sortAnArray(array);
			obj.findTheDuplicateElements(array);
			obj.findSecondLargestAndSecondSmallestElement(array);
			obj.leftRotationInAnArray(array);
			obj.removeElementInArray(array);

		}

	}

	class QuestionsOnArray {

		void sortAnArray(int[] arr) {
			
			for(int i=0;i<(arr.length-1);i++)
			{
				int min =i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]<arr[min])
						min=j;
				}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			System.out.print("Sorted array: ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}

		}

		void findTheDuplicateElements(int[] arr) {
			System.out.println("\n");
			System.out.print("Duplicate Element are: ");
			for(int i=0;i<arr.length;i++)
			{
			  for(int j=i+1;j<arr.length;j++)
			  {
				  if(arr[j]==arr[i])  
				  System.out.print(arr[i]+" ");
		       }
			}
		}

		void findSecondLargestAndSecondSmallestElement(int[] arr) {
			System.out.println("\n");
			for(int i=0;i<(arr.length-1);i++)
			{
				int min =i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]<arr[min])
						min=j;
				}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			System.out.println("Second Smallest Number="+arr[1]);
			System.out.println("Second Largest Number="+arr[arr.length-2]);
		}

		void leftRotationInAnArray(int[] arr) {
			System.out.println("\n");
			try (Scanner in = new Scanner(System.in)) {
				System.out.print("Enter the Number of times of left rotation to be done: ");
				int n = in.nextInt();
				for(int i=0;i<n;i++)
				{
					int j,first=0;
					first=arr[0];
					
					for(j=0;j<(arr.length-1);j++)
					{
						arr[j]=arr[j+1];
					}
					arr[j]=first;
				}
			}
			System.out.println("Array After left Rotation");
	        for(int i=0;i<arr.length;i++)
	        System.out.print(arr[i]+" ");
		}

		void removeElementInArray(int[] arr) {
			System.out.println("\n");
			try (Scanner in = new Scanner(System.in)) {
				System.out.print("Enter the Position whose Element is to be delete: ");
				int n=in.nextInt();
				System.out.println("Deleted Element is: "+arr[n]);
				for(int i=n;i<(arr.length-1);i++)
				{
				  arr[i]=arr[i+1];
				}
				n=arr.length-1;
				for(int i=0;i<n;i++)
				{
					System.out.println(arr[i]);
				}
			}
			
		}

	}
