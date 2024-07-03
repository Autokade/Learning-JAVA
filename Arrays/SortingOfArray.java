public class SortingOfArray {
    public static void main(String[] args) {
        String Arr[] = {"java","python","pascal","smalltalk","ada","basic"};
        java.util.Arrays.sort(Arr);

        for(String x:Arr){
            System.out.println(x);
        }
    }
}
