package for_loop;
import java.util.*;
public class SumorProduct {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int choice=sc.nextInt();
	        int sum=0,p=1;
	        if(choice==1)
	        {
	            for(int i=1;i<=n;i++)
	            {
	                sum=sum+i;
	            }
	            System.out.println(sum);
	        }
	      else  if(choice==2)
	        {
	            for(int i=1;i<=n;i++)
	            {
	                p=p*i;
	            }
	            System.out.println(p);
	        }
	        else
	        System.out.println("-1");
	}

}
