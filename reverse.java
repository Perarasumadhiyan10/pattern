import java.util.*;
public class reverse{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=n-i+1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
// output:
// input:5
// 5 
// 5 4
// 5 4 3
// 5 4 3 2
// 5 4 3 2 1 