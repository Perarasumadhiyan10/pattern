import java.util.*;
public class numchanging {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(nums+" ");
                nums++;
            }
            System.out.println();
        }
    }
}
// output:
// input:5  
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15