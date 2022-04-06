import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter  year:"); 
	      int  year=sc.nextInt(); 
	      sc.close();
	      if(year%4==0)
	      System.out.println("Given year is leap year");
	      else
	    	  System.out.println("Given year is not a leap year");
	    
	}

}
