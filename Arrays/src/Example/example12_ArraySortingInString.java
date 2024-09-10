package Example;

import java.util.Arrays;

public class example12_ArraySortingInString 
{
	public static void main(String[]args)
	{
		/////array declaration
		String []ar=new String[5];
		
		////array initialization
		ar[0]="Rushikesh";
		ar[1]="Ajay";
		ar[2]="Saurav";
		ar[3]="Ankit";
		ar[4]="Roshan";
		
		////array usage
		System.out.println(ar[4]);
		System.out.println(ar.length);
		System.out.println(ar[4]+" & "+ar[2]);
		
		System.out.println("......Print Original Data........");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
Arrays.sort(ar);
		System.out.println("......Print Array in Ascending Order........");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("......Print Array in Descending Order........");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
	}	
}
