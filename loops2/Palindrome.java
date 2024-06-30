
import java.lang.*;
import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Print a number");
        int n = sc.nextInt();

        int rev = 0, r, m=n;
        while (n>0) {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println(rev);
        if (rev == m) {
            System.err.println("its a palndrome number");
        } else {
            System.out.println("its not  a palindrome number");
            
        }
    }
    
}
