package Example;

public class example9_printArrayInReverseOrder 
{
	public static void main(String[]args)
	{
		//array declaration
		int []ar=new int[7];
		
		////array initialization
		ar[0]=234;
		ar[1]=235;
		ar[2]=236;
		ar[3]=237;
		ar[4]=238;
		ar[5]=239;
		ar[6]=240;
		
		
		System.out.println(ar[6]);
		System.out.println(ar.length);
		System.out.println(ar[6]+ar[4]);
		System.out.println("..............................");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("........In Reverse.........");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	
	}
}
