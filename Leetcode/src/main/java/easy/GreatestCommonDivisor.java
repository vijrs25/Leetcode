package easy;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = 0;
			int b = 0;
			for (int i = 0; i < 10; i++) {
				System.out.println("Enter a and b ");
				a = sc.nextInt();
				b = sc.nextInt();

				while (b != 0) {
					int temp = a % b; // 12, 12, 18 == 6, 18,12
					a = b; // 18 // 12
					b = temp; // 12 // 6
					System.out.println(a);
					System.out.println(b);
				}
			}
		}

	}

}
