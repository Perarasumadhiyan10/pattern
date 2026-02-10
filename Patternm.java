import java.util.*;
public class Patternm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("X ");
                }
                else{
                    System.out.print("o ");

                }
            }
            System.out.println();
        }
    }
}
// Output:
// 5
// X X X X X 
// X o o o X
// X o o o X
// X o o o X
// X X X X X