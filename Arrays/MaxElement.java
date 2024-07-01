import java.util.Scanner;

public class MaxElement {

public static void main(String[] args) {

    int sum=0;
    int A[] = {3,9,7,8,12,6,5,15,4,10};
    
     int max = 0;


    for(int i=0; i<A.length;i++){
        if (max < A[i]) {
            max = A[i];
        }

    }
    System.out.println(max);
}
}
