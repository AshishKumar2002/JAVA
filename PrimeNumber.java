package for_loop;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j,i,counter;
		for(j=2;j<=n;j++){
	         counter=0;
	         for(i=1;i<=j;i++){
	            if(j%i==0){
	               counter++;
	            }
	         }
	         if(counter==2)
	         System.out.print(j+" ");
	      }
		
	}
}
