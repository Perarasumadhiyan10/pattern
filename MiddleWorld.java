import java.util.*;
public class MiddleWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length()/2;
        String m="";
        for(int i=l;i<s.length();i++){
            m += s.charAt(i);
            System.out.println(m);
        }
        for(int i=0;i<l;i++){
            m += s.charAt(i);
            System.out.println(m);
        }
    }
}

// Input: hello
// Output:
// l
// ll
// llo
// lloh
// llohe