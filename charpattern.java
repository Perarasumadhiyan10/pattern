import java.util.*;
public class charpattern {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char ch=65;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch+=2;
            System.out.println();
        }

    }
}
// output:
// input:3
// A 
// C C
// E E E
// G G G G