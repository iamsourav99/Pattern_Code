import java.util.Scanner;

public class Pattern {
	static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*\t");
			}
			System.out.println(" ");
		}
	}

	static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println(" ");
		}
	}

	static void pattern3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j + 1) + "\t");
			}
			System.out.println(" ");
		}
	}

	static void pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i + 1) + "\t");
			}
			System.out.println(" ");
		}
	}

	static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i + 1; j++) {
				System.out.print("*\t");
			}
			System.out.println(" ");
		}
	}

	static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j + "\t");
			}
			System.out.println(" ");
		}
	}

	static void pattern7(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			// space
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}
			// space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

	static void pattern10(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int stars = i;
			if (i > n)
				stars = 2 * n - i;
			for (int j = 0; j < stars; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the no of line you want to print:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
		pattern8(n);
		pattern10(n);
	}

}
