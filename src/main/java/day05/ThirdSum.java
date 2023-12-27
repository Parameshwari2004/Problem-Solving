package day05;

import java.util.Scanner;

public class ThirdSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int res = i * i;

			System.out.print(res + " ");
		}

	}

}
