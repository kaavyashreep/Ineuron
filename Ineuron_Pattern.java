package assignment_1;

public class Ineuron_Pattern {

	public static void main(String[] args) {
		int n = 9, i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) // prints I
			{
				if (i == 0 || i == n - 1 || j == (n - 1) / 2)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("          ");
			for (j = 0; j < n; j++) { // Prints Heart

				if (i - j == (n) / 2 || i + j == (n - 1) + (n - 1) / 2 || j == 0 && i > 0 && i <= (n - 1) / 2
						|| j == n - 1 && i > 0 && i <= (n - 1) / 2 || i == 0 && j > 0 && j < (n - 1) / 2
						|| i == 0 && j > 4 && j < n - 1 || i == 1 && j == (n - 1) / 2)
					System.out.print("# ");
				else
					System.out.print("  ");
			}
			System.out.print("          ");
			for (j = 0; j < n; j++) // prints I
			{
				if (i == 0 || i == n - 1 || j == (n - 1) / 2)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("  ");

			for (j = 0; j < n; j++) // prints N
			{
				if (i == j || j == 0 || j == n - 1)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("   ");

			for (j = 0; j < n; j++) { // prints E

				if (i == 0 || i == n - 1 || i == (n - 1) / 2 || j == 0)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for (j = 0; j < n; j++) { // prints U

				if (i < n - 2 && j == 0 || i < n - 2 && j == n - 1 || j == 1 && i == n - 2 || j == n - 2 && i == n - 2
						|| i == n - 1 && j > 1 && j < n - 2)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for (j = 0; j < n; j++) { // prints R

				if (j == 0 || i == 0 && j <= n - 3 || (i == (n - 1) / 2 && j <= n - 2) || i == 1 && j == n - 2
						|| i == ((n - 1) / 2) - 1 && j == n - 2 || i == ((n - 1) / 2) - 2 && j == n - 1
						|| i - j == (n - 3) / 2)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for (j = 0; j < n; j++) { // prints O

				if (i == 0 && j > 0 && j < n - 1 || i == n - 1 && j > 0 && j < n - 1 || j == 0 && i > 0 && i < n - 1
						|| j == n - 1 && i > 0 && i < n - 1)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			for (j = 0; j < n; j++) { // prints N

				if (j == 0 || j == n - 1 || i == j)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
