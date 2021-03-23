package basics;

import java.util.*;

public class sasi1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit to find factorial of it:");
		int a=sc.nextInt();
		int i,fact=1;
		for(i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the given no is:"+fact);

	}

}
