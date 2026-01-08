import java.util.*;
public class number{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}

// OUTPUT
// Input:
// 5
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5