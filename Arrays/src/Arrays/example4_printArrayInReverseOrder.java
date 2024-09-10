package Arrays;

public class example4_printArrayInReverseOrder 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];           //0 to 4
		
		ar[0]=105;
		ar[1]=106;
		ar[2]=108;
		ar[3]=107;
		ar[4]=109;
		
		System.out.println("-----print original data-------");
		for(int i=0; i<=ar.length-1; i++)
		{                                    
			System.out.println(ar[i]);
		}
		
		System.out.println("-------print array in reverse order---------");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
