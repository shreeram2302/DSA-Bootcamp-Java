public class fibo {


     public static int fibo(int n){
            if (n==0){
                  return 0;

            }
            if (n==1) {
                  return 1;
            }

            return fibo(n-1) + fibo(n-2);
      }

      public static void main(String[] args) {

            for (int i = 0; i <= 10; i++) {
                  System.out.print(fibo(i) + " ");
              }
            // int n = 10, i = 1;

            // int a = 0, b = 1, c = 1;
            // for (int i = 0; i < n; i++) {
            // System.out.println(b);
            // a=b;
            // b=c;
            // c=a+b;
            // }

            // while (i <= n) {
            //       System.out.println(b);
            //       a = b;
            //       b = c;
            //       c = a + b;
            //       i++;
            // }


      }


}
