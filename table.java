import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the  number");
		int number=sc.nextInt();
		sc.close();
		for(int i=0;i<=number;i++)
		{
			System.out.println(number+"*"+i+"="+number*i);
		}

	}

}
