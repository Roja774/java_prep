import java.util.Scanner;
public class sumandavg {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the 5 numbers");
	int n,sum=0;
	 for(int i=1; i<=5;i++)
	 {
		 n=sc.nextInt();
		 sum+=n;
		 
	 }
	   sc.close();
	   System.out.println("The sum of 5 no:"+sum);
	   float avg=sum/5;
	  
	   System.out.println("The avg 5 no's is:"+avg);
	   
	   
	}

}
