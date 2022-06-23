import java.util.*;

public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int StartingNumber=1;
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(StartingNumber);
				StartingNumber++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
