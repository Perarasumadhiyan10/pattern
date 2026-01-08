import java.util.*;
public class pattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        a-=n;
        for(int i=n;i>=1;i--)
        {
            int temp=a;
            for(int j=0;j<i;j++)
            {
                System.out.print(temp+" ");
                temp++;
            }
            a-=(i-1);
            System.out.println();
        }

    }
    
}

// output:
// input:3
// 1 
// 2 3
// 4 5 6
// 4 5 6
// 2 3
// 1