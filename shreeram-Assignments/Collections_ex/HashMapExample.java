package Collections_ex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapExample {
      public static void main(String[] args) {
            HashMap<Integer,String> map= new HashMap<>();

            map.put(0, "SHREERAM");
            map.put(1, "LOKESH");
            map.put(2, "NIKHIL");
            map.put(3, "SHRIJAY");
            map.put(4, "JAY");

           //Iterator<Integer> itr = map.keySet().iterator();

//            while (itr.hasNext()){
//                  System.out.println(map.get(itr.next()));
//            }
//            System.out.println(map.containsKey(5));
//            System.out.println(map.containsValue("JAY"));
//
            
            HashSet<Integer> hashSet= new HashSet<>();
            hashSet.add(99);
            hashSet.add(47);
            hashSet.add(77);
            hashSet.add(12);

            System.out.println(hashSet);
            Iterator<Integer> itr2 = hashSet.iterator();

           while(itr2.hasNext()){

                 System.out.println(itr2.next());
           }


      }
      
}