import java.util.*;
public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter first number:"); 
	      int no1=sc.nextInt(); 
	      System.out.println("Enter second number:");
	      int no2=sc.nextInt(); 
	      System.out.println("Enter third number:");
	      int no3=sc.nextInt(); 
	      sc.close();
	     if((no1>no2)&&(no1>no3))
	    	System.out.println("The greatest no is:"+no1);
	     else if(no2>no3)
	    	 System.out.println("The greatest no is:"+no2);
	     else
	    	 System.out.println("The greatest no is:"+no3);	 
	    	 
	     

	}

}
