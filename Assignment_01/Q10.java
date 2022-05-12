package Assignment_01;

import java.util.Scanner;

public class Q10 {
	
	public static void main(String[] args) {
		City arr[]=new City[4];
		
		System.out.println("Question 10");
		System.out.println("Vivek Sati_F_20011773");
		System.out.println("\t");
		
		Scanner obj= new Scanner(System.in);
		String p;
		int l,m,n,o;
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the name of the city");
			p=obj.nextLine();
			
			System.out.println("enter no of maruti_k10 foollowed by zen_astelo,wagnor and maruti_sx4");
			l=obj.nextInt();
			m=obj.nextInt();
			n=obj.nextInt();
			o=obj.nextInt();
			
			obj.nextLine();
			
			arr[i]= new City(p,l,m,n,o);
		}
		l=m=n=o=0;

		for(int i=0;i<4;i++)
		{
			l+=arr[i].maruti_k10;
			m+=arr[i].zen_astelo;
			n+=arr[i].wagnor;
			o+=arr[i].maruti_sx4;
			}
		System.out.println("No of maruti_k10="+l);
		System.out.println("No of zen_aastelo="+m);
		System.out.println("No of wagnor="+n);
		System.out.println("No of marut_sx4="+o);
		
		obj.close();
	}
	}

	class City{
		 String city_name;
		 int maruti_k10;
		 int zen_astelo;
		 int wagnor;
		 int maruti_sx4;
		 
		 City(String city_name,int maruti_k10,int zen_astelo,int wagnor,int maruti_sx4)
		 {
			 this.city_name=city_name;
			 this.maruti_k10=maruti_k10;
			 this.zen_astelo=zen_astelo;
			 this.wagnor=wagnor;
			 this.maruti_sx4=maruti_sx4;
		 }
	}
	