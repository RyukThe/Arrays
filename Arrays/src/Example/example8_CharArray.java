package Example;

public class example8_CharArray 
{
	public static void main(String[]args)
	{
		///array declaration
		char []ar=new char[8];
		
		///array initialization
		ar[0]='Y';
		ar[1]='A';
		ar[2]='U';
		ar[3]='D';
		ar[4]='Z';
		ar[5]='G';
		ar[6]='V';
		ar[7]='M';
		
		
		///array usage
		System.out.println(ar[4]);
		System.out.println("Length of array is:- " + ar.length);
		System.out.println(ar[5]+ar[7]);
		
		System.out.println("..........Print all Media............");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
