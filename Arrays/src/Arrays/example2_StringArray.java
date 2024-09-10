package Arrays;

public class example2_StringArray
{
	public static void main(String[] args) 
	{
		String [] ar=new String[4];             //0 to 3
		
		ar[0]="mahesh";
		ar[1]="ramesh";
		ar[2]="suresh";
		ar[3]="ganesh";
		
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


