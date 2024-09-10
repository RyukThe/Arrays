package Example;

import java.util.Arrays;

public class example11_ArraySortingInint
{
	public static void main(String[]args)
	{
		////array declaration
		int []ar=new int[7];
		
		///array initialization
		ar[0]=13;
		ar[1]=17;
		ar[2]=12;
		ar[3]=15;
		ar[4]=14;
		ar[5]=18;
		ar[6]=16;
		
		////array usage
		System.out.println(ar[4]);
		System.out.println(ar.length);
		System.out.println(ar[4]+ar[2]);
		
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
