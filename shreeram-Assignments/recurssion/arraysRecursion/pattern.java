public class pattern {
    public static void main(String[] args) {
        patternRec(5,5);
    }
    static void pattern(int r,int c){
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                System.out.print(" * ");
            }
            c--;
            System.out.println();
        }
    }

//    static void patternRec(int r,int c){
//        if (r<=0){
//            return;
//        }
//        if (c<r){
//            System.out.print(" * ");
//                c++;
//            patternRec(r,c);
//        }
//        else {
//            System.out.println();
//
//
//            patternRec(r-1,0);
//        }
//
//    }


// normal triangle//


    static void patternRec(int r,int c){
        if (r<=0){
            return;
        }
        if (c<r){

            patternRec(r,c+1);
            System.out.print(" * ");
        }
        else {

            patternRec(r-1,0);
            System.out.println();

        }

    }


}
