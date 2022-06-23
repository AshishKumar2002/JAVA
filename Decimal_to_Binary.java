package for_loop;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long deci=sc.nextLong();
		long rem,ans=0,pv=1;
		while(deci!=0) {
			rem=deci%2;
			ans=ans+rem*pv;
			deci=deci/2;
			pv*=10;
		}
		System.out.println(ans);

	}

}
