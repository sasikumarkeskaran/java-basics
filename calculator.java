package basics;

import java.util.*;

public class print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.division");
		System.out.println("Enter the two no to perform operation:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;
		System.out.println("Enter the operation to perform:");
		int no = sc.nextInt();
		switch (no) {
		case 1:
			result = a + b;
			System.out.println("The addition of two no is:" + result);
			break;
		case 2:
			result = a - b;
			System.out.println("The subtraction of two no is:" + result);
			break;
		case 3:
			result = a * b;
			System.out.println("The multiplication of two no is:" + result);
			break;
		case 4:
			result = a / b;
			System.out.println("The division of two no is:" + result);
			break;

		}

	}

}
