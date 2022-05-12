package Unit_01;

public class P6_Task01_ArraysInJava {


	/*
	 * Normally,an array is a collection of similar type of elements which has contiguous memory locations
	 * Java array is an object which contains element of a similar data type
	 * We can store only a fixed set of elements in a Java array
	 * Size limit issue:
	    1.We can store only the fixed size of elements in the array
	    2.It doesn't grow its size at runtime
	    3.To solve this problem, collection framework is used in Java which grows automatically
	  
	 * There are two types of array
	    1.Single Dimensional Array
	    2.Multidimensional Array
	    
	 * Declare an Array in Java
	     DataType arrayRefVar[];
	 *  OR
	     DataType[] arrayRefVar;
	 *  OR
	     DataTpye []arrayRefVar;
	 *   
	 * Instantiation of an Array in Java
	    arrayRefVar=new datatype[size];           
	 */
		
		public static void main(String[] args) {
			
			//Declaration
			int array1[];
			
			int[] array2;
			int[] array3;
			
			// Can not do it as we have not provide it any memory/space yet!
			//array1[0]=1;;
			
			//Initialization, during initialization we have to provide the size of the array
	        array1=new int[6]; //{1,2,3,4,5,6}
	        
	        //Assigning values to the Java array
	        for(int i=0;i<array1.length;i++) // length is the property of the array
	        	array1[i]=i;
	        
	        int array4[]= {33,3,4,5}; //Declaration.instatitation and initialization
	        
	        //Passing array to method
	        arrayAsParameter(array4);
	        
	        //Passing anonymous array in a method
	        arrayAsParameter(new int[] {33,3,4,5});
	        
	        //Returning Array from the method
	        int [] array5=arrayAsReturnType();
	        System.out.println("\n");
	        System.out.println("Element converted into String:");
	        System.out.println(array5.toString());
	        System.out.println("\n");
	        
	        //ArrayTIndexOutOfBoundsException
	        int arr[]= {50,60,70,80};
	        System.out.println("Element of Array(i):");
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]+" ");
	        }
	        System.out.println("\n");
	        
	        //Multidimensional Array In Java
	        int[][] arr6=new int[3][3];//3 row and 3 column
	        
	        System.out.println("Element inside the multidimensional array:");
	        for(int i=0;i<3;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		System.out.print(arr6[i][j]+" ");
	        	}System.out.println("\n");
	        }
	        
	        int counter=0;

	        for(int i=0;i<3;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		counter++;
	        		arr6[i][j]=counter;
	        	}
	        }

	        System.out.println("Element inside the multidimensional array:");
	        for(int i=0;i<3;i++)
	        {
	        	for(int j=0;j<3;j++)
	        	{
	        		System.out.print(arr6[i][j]+" ");
	        	}
	        	System.out.println("\n");
	        }
	        
		}
	        
	        static void arrayAsParameter(int arr[]) {//declare empty array as parameter
	        	System.out.println("\n");
	        	System.out.println("Element of array via parameters:");
	        	for(int i=0;i<arr.length;i++) // length is the property of array
	        		System.out.print(arr[i]+" ");
	        	}
	        
	        
	        //Returning Array from the Method
	        static int[] arrayAsReturnType() {
	        	int array4[]= {33,3,4,5};
	        	
	        	return array4;
	        }
	        
		}


