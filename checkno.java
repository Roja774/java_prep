import java.util.*;
public class checkno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      
      int number=sc.nextInt(); 
      sc.close();
      if(number>0)
    	  System.out.println("Number is positive");
      else if(number!=0)
       System.out.println("Number is neative");
      else
    	  System.out.println("number is not +ve and -ve");

	}
	}

