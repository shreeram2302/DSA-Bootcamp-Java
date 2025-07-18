
class MyHashSet {
    private class listNode{
        int key;
        listNode next;
        listNode(int key){
            this.key=key;
        }
    }


    private listNode[] buckets;
    private static int capacity=1000;

    MyHashSet(){
        buckets=new listNode[capacity];
    }

    private int hash(int key){
        return key%capacity;
    }

    public void add(int key){
        int index=hash(key);

        if(buckets[index]==null){
            buckets[index]=new listNode(key);
        }
        else {
            listNode current= buckets[index];
            while (true){
                if(current.key==key){
                    return;
                }
                if (current.next==null){
                    break;
                }
                current=current.next;
            }
            current.next=new listNode(key);
        }
    }
    public boolean contains(int key){
        int index=hash(key);
        listNode current = buckets[index];
      while (current!=null){
          if (current.key==key){
              return true;
          }
          current=current.next;
      }
      return false;

    }




    public static void main(String[] args) {
            MyHashSet s= new MyHashSet();
//        System.out.println("hiii");
//            s.add(99);
//            s.add(585);
//            s.add(757);
//            s.add(100);
//            s.add(1000);
//            s.add(1000);
//            s.add(10);
//            s.add(757);
//            s.add(757);
            s.add(99);
        System.out.println(   s.contains(99));
            s.contains(90);


//        System.out.println(Arrays.stream(s.buckets).toList());
    }

}