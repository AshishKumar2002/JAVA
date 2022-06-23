import java.util.Scanner;

public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print((char)(64+j+i-1));
				j=j+1;
			}
			i=i+1;
			System.out.println();
		}
	}

}
