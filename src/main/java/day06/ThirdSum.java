package day06;

public class ThirdSum {

	public static void main(String[] args) {

		int A = 20;
		int B = 12;
		int C = 30;

		int large;

		if (A >= B && A >= C) {
			large = A;
		} else if (B >= A && B >= C) {
			large = B;
		} else {
			large = C;
		}

		System.out.println("Largest Number " + large);

	}

}
