package Arrays;

public class example3_CharArray 
{
	public static void main(String[] args) 
	{
		char [] ar=new char[4];             //0 to 3
		
		ar[0]='A';
		ar[1]='C';
		ar[2]='D';
		ar[3]='B';
		
		System.out.println(ar[2]);
		System.out.println(ar.length);
		
		System.out.println("---------print all data ----------");
//		for(int i=0; i<=3; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}

}

