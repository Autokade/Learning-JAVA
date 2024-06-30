import java.util.Scanner;

public class RadixNumber {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num;
    System.out.println("Enter a Number ");
    num = sc.nextLine();
    if (num.matches("[01]+")) {
        System.out.println("binary Radix = 2");
        
    } else if(num.matches("[0-7]+")){
        System.out.println("Octal radix = 8");
    }
    else if (num.matches("[0-9]+")) {
        System.out.println("Decimal radix = 10");
    }
    else if(num.matches("[0-9A-F]+ ")){
        System.out.println("Hexa radix = 16");
    }
    else{
        System.out.println("Not a number");
    }
}    
}
