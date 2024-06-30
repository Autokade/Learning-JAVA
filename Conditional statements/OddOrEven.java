import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        
        if (n%2 == 0) {
            System.out.println("given number is even");
            
        } else {
            System.out.println("Given number is odd");
        }
    }

}
