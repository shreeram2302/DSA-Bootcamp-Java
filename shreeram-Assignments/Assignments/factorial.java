public class factorial {
    public static void main(String[] args) {

        int n=7;
        int sum=1;
        for (int i = n; i > 0; i--) {
            sum *=i;

        }
        System.out.println(sum);
    }

}
