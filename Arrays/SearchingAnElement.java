import java.util.Scanner;

public class SearchingAnElement {
public static void main(String[] args) {

    int sum=0;
    int A[] = {3,9,7,8,12,6,5,15,4,10};
    

    System.out.println("enter a key");
    Scanner sc = new Scanner(System.in);
    int key = sc.nextInt();


    for(int i=0; i<A.length;i++){
        if (key == A[i]) {
            System.out.println("Element found at " + i);
            System.exit(0);
        }
        
    }
    System.out.println(sum);
}
}
