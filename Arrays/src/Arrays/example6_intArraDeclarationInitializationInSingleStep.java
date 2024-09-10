package Arrays;

import java.util.Arrays;

public class example6_intArraDeclarationInitializationInSingleStep 
{
	public static void main(String[]args)
	{
		int[]ar={15,12,17,11,18};  //0,1,2,3,4 (0 to 4)
		
		System.out.println(ar[2]);  // 17
		System.out.println(ar.length); // 5
		
		System.out.println("Print All Data");
		
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);//// println ----> row vise output.
		}
		System.out.println("............Ascending Order............");
Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);//// println ----> row vise output.
		}
		System.out.println("............Descending Order............");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
