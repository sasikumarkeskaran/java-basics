package basics;

import java.util.*;

public class Palin {

	public static void main(String[] args) {
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		reverse(no);
		

	}
	public static void reverse(int n)
	{
		int temp,r,no=0,sum;
		temp=n;
		while(n>0)
		{
			r=n%10;
			no=no*10+r;
			n=n/10;
		}
		sum=temp+no;
		palin(sum);
	}
	public static void palin(int pal)
	{
		int temp1,r1,no1=0;
		temp1=pal;
		while(pal>0)
		{
			r1=pal%10;
			no1=no1*10+r1;
			pal=pal/10;
		}
		if(no1==temp1)
		{
			System.out.println(temp1);
			return;
		}
		else
		{
			reverse(temp1);
		}
	}

}
