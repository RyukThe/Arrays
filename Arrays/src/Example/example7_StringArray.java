package Example;

public class example7_StringArray 
{
public static void main(String[]args)
{
	String[]ar=new String[5];
	
	ar[0]="Nilesh";
	ar[1]="Dinesh";
	ar[2]="Rupesh";
	ar[3]="Suresh";
	ar[4]="Ramesh";
	
	System.out.println(ar[0]);
	System.out.println(ar[1] + ar[2]);
	System.out.println(ar.length);
	
	System.out.println("---------print all data ----------");
	
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
}
}
