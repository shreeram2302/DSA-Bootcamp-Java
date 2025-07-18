package patterns;

public class patterns {

    public static void main(String[] args) {

        int n = 5;

//            for (int row = 1; row <= 4; row++) {
//                  for (int col = 1; col <= row; col++) {
//                        System.out.print("* ");
//                  }
//                  System.out.println("");
//            }

//          pyramid

//          for (int i = 1; i <=n ; i++) {
//                for (int j = 1; j <=n-i+1 ; j++) {
//                      System.out.print(" ");
//                }
//                for (int j = 1; j <=i; j++) {
//                      System.out.print("* ");
//                }
//                System.out.println("");
//          }

//          int rows = 5; // number of rows in the pattern
//
//          for (int i = 1; i <= rows; i++) {
//                // Print spaces
//                for (int j = 1; j <= rows - i; j++) {
//                      System.out.print("  ");
//                }
//
//                // Print stars
//                for (int k = 1; k <= i; k++) {
//                      System.out.print("* ");
//                }
//
//                // Move to the next line
//                System.out.println();
//          }


//          for (int i = 1; i <=n; i++) {
//                for (int j =1; j <=i; j++) {
//                      System.out.print(j+" ");
//                }
//                System.out.println("");
//          }


//          for (int i = 1; i <=n; i++) {
//            int v=1;
//                for (int j = 1; j <=n-i; j++) {
//                      System.out.print("  ");
//                    v+=1;
//                }
//                v=n-v+1;
//                for (int j = v; j>=1 ; j--) {
//                      System.out.print(j+" ");
//
//                }
//                System.out.println("");
//          }

//          reverse pyramid

//          for (int i = 1; i <=n ; i++) {
//                for (int j = 1; j <=i ; j++) {
//                      System.out.print(" ");
//                }
//
//                for (int j = 1; j <= n-i+1 ; j++) {
//                      System.out.print("* ");
//                }
//                System.out.println();
//          }

        //   System.out.println(9/2 );

        int col = 1;
//        for (int i = 1; i <= 2*n ; i++) {
//
//            col= i >n ? 2*n-i :i;
//            for (int j = 1; j <=col; j++) {
//                System.out.print("* ");
//            }
//
//
//            System.out.println();
//
//        }

//daimond approach 1
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=n-i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        daimond appraoch 2

//        for (int i = 1; i <= n * 2; i++) {
//            int spaces = i >= 5 ? i - n : n - i;
//            int star = i >= 5 ? n*2-i :i;
//            for (int j = 1; j <=spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= star ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}
