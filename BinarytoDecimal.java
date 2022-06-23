package for_loop;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bin=sc.nextInt();
		int rem,deci=0,base=1;
		while(bin!=0) {
			rem=bin%10;
			deci=deci+rem*base;
			bin=bin/10;
			base*=2;
		}
		System.out.println(deci);
	}
}
