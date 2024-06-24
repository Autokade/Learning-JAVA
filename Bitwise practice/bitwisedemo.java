

public class bitwisedemo {

    public static void main(String[] args) {
        int x = 10, y = 6,z ;    
        y=~x;
        System.out.println(String.format("%s", Integer.toBinaryString(x)));
        System.out.println(String.format("%32s", Integer.toBinaryString(y)));
    }
    
}
