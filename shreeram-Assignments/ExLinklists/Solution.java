import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {


//        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        int index ;

        if (ruleKey.equals("type")) {
            index = 0;

        } else if (ruleKey.equals("color")) {
            index = 1;

        } else {
            index = 2;
        }

       int cnt = 0;

        for (List<String> i : items) {

            if (i.get(index).equals(ruleValue)) {
                cnt+=1;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {

//        String[][] item={
//                {"phone", "blue", "pixel"},
//                {"computer", "silver", "lenovo"},
//                {"phone", "gold", "iphone"}};
//
//                List<List<String>> items =Arrays.stream(item)
//                        .map(Arrays::asList)
//                        .collect(Collectors.toList());;



//        String ruleKey = "color",ruleValue = "silver";
//        System.out.println(countMatches(items,ruleKey,ruleValue));



    }
}