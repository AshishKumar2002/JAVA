package for_loop;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n3;
		int n1=1;
		int n2=1; 
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
		

	}

}
