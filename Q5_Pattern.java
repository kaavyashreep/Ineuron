package assignment_1;

public class Q5_Pattern {

	public static void main(String[] args) {
		int n=14,i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(j==0 || i==0||i==(n-1) || i+j<=(n-1)/2 || i-j>=(n-1)/2)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
