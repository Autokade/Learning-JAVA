
import java.util.Scanner;


/**
 * triangleSurface
 */
public class triangleSurface {

    public static void main(String args[]){
        int a,b,c;
        float  s;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your side lengths: ");
        a = sc.nextInt();
        b = sc.nextInt();
    c = sc.nextInt();
    s = (a+b+c)/2f;
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("Area is " +area);
    }
}