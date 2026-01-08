import java.util.*;
public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int t=n*(n+1)/2;
        char ch =(char)('A'+t-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
}

// output:

// input:4
//       J 
//     I H
//   G F E
// D C B A