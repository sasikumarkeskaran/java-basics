package basics;

import java.util.*;

public class NEvenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of even no you want:");
		int n = sc.nextInt();
		int count = 0, i;

		for (i = 1; i < 100 && count < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}

		}

	}

}
