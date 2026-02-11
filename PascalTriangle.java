import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = 0; i < n; i++) {
            int val = 1;
            for(int k=0;k<n-i-1;k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(val+" ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
