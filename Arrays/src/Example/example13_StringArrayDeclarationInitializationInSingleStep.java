package Example;

import java.util.Arrays;

public class example13_StringArrayDeclarationInitializationInSingleStep
{
	public static void main(String[]args)
	{
		String[]str= {"Roshan","Rahul","Nishant","Sachin","Vicky","LandeGang"};  //0,1,2,3,4,5 (0 to 5)
		
		System.out.println("NeighbourHood:- "+str[2]);  // Nishant
		System.out.println("No.of Friends:- "+str.length); // 6
		
		System.out.println("..............Print All Data.........");
		
		
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);//// println ----> row vise output.
		}
		System.out.println("............Ascending Order............");
Arrays.sort(str);
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);//// println ----> row vise output
		}
		System.out.println("............Descending Order............");
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.println(str[i]);   ///println ----> row vise output
		}
	}
}

