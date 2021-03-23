package basics;

import java.util.*;

public class sasi {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit to sum it:");
		int a=sc.nextInt();
		int sum=0,no;
		while(a>0)
		{
			no=a%10;
			sum=sum+no;
			a=a/10;
		}
		System.out.println("The sum of digit is:"+sum);

	}

}
