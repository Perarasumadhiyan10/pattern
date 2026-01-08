import java.util.*;
public class stackoverflow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int space=2*(n-i)-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            for(int k=0;k<space;k++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            space-=2;
            System.out.println();
        }
    }
}
