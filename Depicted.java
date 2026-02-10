import java.util.*;
public class Depicted{
           public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int r=2*n-1;
            for(int i=0;i<r;i++){
                for(int j=0;j<r;j++){
                    int d=n-Math.min(Math.min(i,j),Math.min(r-1-i,r-1-j));
                    System.out.print(d+" ");
                }
                System.out.println();
            }
           }
}
// Output:
// 9
// 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 
// 9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9
// 9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9
// 9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9
// 9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9 
// 9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9
// 9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9
// 9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9
// 9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9
// 9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9
// 9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9
// 9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9
// 9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9 
// 9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9
// 9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9
// 9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9
// 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9