package recurssion;

public class second {
      public static void main(String[] args) {
            // System.out.println(addIndivisualNum(1111));
            System.out.println(1234%10);
      }

      static int addIndivisualNum(int a) {

            if (a <1) {
                  return 0;
            }
            return (a % 10) + addIndivisualNum(a / 10);

      }

}
