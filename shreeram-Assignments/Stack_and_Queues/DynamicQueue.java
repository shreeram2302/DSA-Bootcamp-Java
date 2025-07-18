public class DynamicQueue extends CustomQueue{
    @Override
    public boolean add(int val) {
        if(this.isFull()){
            int[] temp= new int[data.length*2];

            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];

            }
            data=temp;
        }
        return super.add(val);

    }
}
