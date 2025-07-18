public class fibonacci {
    public static void main(String[] args) {
        fibo2(8);
    }
    static int fibo(int n){

        if (n==1 || n==0){


            return n;
        }


        return fibo(n-1)+fibo(n-2);
    }
    static int n1=0,n2=1,n3=0;
    static  void fibo2(int n){
        if (n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.printf(" "+n3);
        fibo2(n-1);
        }

    }
}
