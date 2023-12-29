package day07;

import java.util.Scanner;

public class SecondSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Students = 5;
		double sum = 0;
		for (int i = 1; i <= Students; i++) {
			System.out.print("Enter score for student " + i + ": ");
			double score = sc.nextDouble();
			sum += score;
		}

		double average = sum / Students;

		System.out.println(average);
	}

}
