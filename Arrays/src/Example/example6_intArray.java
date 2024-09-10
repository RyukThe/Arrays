package Example;

public class example6_intArray 
{
	public static void main(String[]args)
	{
		////step1: array declaration
		int [] ar=new int[7];
		
		///step2: array initialization
		ar[0]=23;
		ar[1]=24;
		ar[2]=27;
		ar[3]=26;
		ar[4]=28;
		ar[5]=25;
		ar[6]=29;
		//ar[7]=30;
		
		//step3: array usage
		System.out.println(ar[1]); //24
		System.out.println(ar[0]+ar[1]); //23+24
		System.out.println(ar.length); //7
		
		System.out.println(".......Print all data of Array........");
//		                 7<=6
//		for(int i=0;i<=6;i++)
//		{								//6
//			System.out.println(ar[i]);
//		}

		for(int i=0;i<=ar.length-1;i++)
		{   ///							 6
			System.out.println(ar[i]);
		}
				
	}
}
