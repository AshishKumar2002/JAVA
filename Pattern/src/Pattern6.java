import java.util.*;

public class Pattern6 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			int startingNumber=i;
			while(j<=i) {
				System.out.print(startingNumber);
				startingNumber++;
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
