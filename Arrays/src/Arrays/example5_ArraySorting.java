package Arrays;

import java.util.Arrays;

public class example5_ArraySorting 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[4];           //0 to 3
		
		ar[0]=400;            //100
		ar[1]=100;           //200
		ar[2]=300;          //300
		ar[3]=200;          //400
		
		System.out.println("-----print original data-------");
		for(int i=0; i<=ar.length-1; i++)
		{                                    
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);           // 100  200  300  400
		System.out.println("----print array in ascending order-------");
		for(int i=0; i<=ar.length-1; i++)
		{                                    
			System.out.println(ar[i]);
		}
		
		System.out.println("----print array in descending order-------");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
