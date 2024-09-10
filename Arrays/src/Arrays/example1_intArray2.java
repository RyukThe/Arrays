package Arrays;

public class example1_intArray2 
{
	public static void main(String[] args) 
	{
		//step1: array declaration
		int [] ar=new int[5];
		
		//step2: array initialization
		ar[0]=105;
		ar[1]=106;
		ar[2]=108;
		ar[3]=107;
		ar[4]=109;
		//ar[5]=110;
		
		//step3: array usage
		System.out.println(ar[0]);
		System.out.println(ar.length);   //5
		
		System.out.println("-----print all data from int array-------");
	//                    5<=4
//		for(int i=0; i<=4; i++)
//		{  //                                     4
//			System.out.println(ar[i]);
//		}
		
		for(int i=0; i<=ar.length-1; i++)
		{  //                                     4
			System.out.println(ar[i]);
		}
		
	}
}
