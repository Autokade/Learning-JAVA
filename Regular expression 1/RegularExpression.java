import java.lang.*;
import java.util.*;
public class RegularExpression {
    public static void main(String[] args) {
    String b="01/12/2000";

    String str = String.valueOf(b);
    System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
