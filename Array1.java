package basics;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int a1[] = new int[50],no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of element of the array:");
		no=sc.nextInt();
		System.out.println("Enter the element of the array:");
		for(int i=0;i<no;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{
				if(a1[i]>a1[j])
				{
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<no;i++)
		{
			System.out.println(a1[i]);
		}

	}

}
