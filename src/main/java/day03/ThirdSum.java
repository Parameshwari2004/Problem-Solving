package day03;

import java.util.Scanner;

public class ThirdSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value");
		int a = sc.nextInt();
		System.out.println("Enter the B value");
		int b = sc.nextInt();
		System.out.println("Enter the C value");
		int c = sc.nextInt();

		int res = (a * b) % c;

		System.out.println(res);
	}

}
