package basics;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to check palindrome:");
		int n=sc.nextInt();
		int r,test=0,temp=n;
		while(n>0)
		{
			r=n%10;
			test=test*10+r;
			n=n/10;
		}
		if(temp==test)
		{
			System.out.println("The given no is palindrome");
		}
		else
		{
			System.out.println("The given no is not palindrome");
		}

	}

}
