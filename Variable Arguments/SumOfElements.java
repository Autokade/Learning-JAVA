public class SumOfElements {
    static int max(int... A) {
        if (A.length == 0) {
            return Integer.MIN_VALUE;
        }
        int s=0;
        for (int i = 1; i < A.length; i++) {
           s=s+A[i];
        }
        return s;
    }

    public static void main(String[] args) {
  
        System.out.println(max(10, 20, 30));
    }
}
