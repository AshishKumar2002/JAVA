package ifElse;
import java.util.Scanner; 
public class SumEvenOddDigits {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int soe=0, soo=0;
		int rem=0;
		while(n!=0)
		{
		rem=n%10;
		if(rem%2==0) {
			   soe=soe+rem;
			}
		if(rem%2!=0)
		{
			soo=soo+rem;
		}
		n=n/10;
		}
		System.out.println(soe+"   "+soo);
	}
}
