import java.util.Scanner;
public class Pattern8 {


	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m;
        for(int i=1;i<=n;i++){
            m=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(m);
                m--;
            }
            System.out.println();
        }
	}

}