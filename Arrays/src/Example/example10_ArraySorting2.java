package Example;

import java.util.Arrays;

public class example10_ArraySorting2
{
	public static void main(String[] args)
	{
		///array declaration
		int []ar=new int[7];
		
		//array initialization
		ar[0]=24;
		ar[1]=23;
		ar[2]=27;
		ar[3]=25;
		ar[4]=26;
		ar[5]=28;
		ar[6]=29;
		
		///array usage
		System.out.println(ar[5]);
		System.out.println("The Length of Array is:- " + ar.length);
		System.out.println("The addition of 23 & 26 :- " + ar[4]+ar[1]);
		System.out.println("..........Print Origianl data...........");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar); ///////23 24 25 26 27 28 29
		
		System.out.println("................Print array in ascending order...............");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("................Print array in descending order...............");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}
