class DynamicArray {
   private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
            this.capacity=capacity;
            this.arr=new int[capacity];
            this.size=0;
    }

    public int get(int i) {
        return arr[i];

    }

    public void set(int i, int n) {
        arr[i]=n;

    }

    public void pushback(int n) {
            if(size==capacity){
                resize();
            }
            arr[size]=n;
            size++;
    }

    public int popback() {
        int value=arr[size-1];
        size--;
        return value;
    

    }

    private void resize() {
            this.capacity *=2;
            int newArray[]=new int[capacity];
            for(int i=0;i<size;i++){
                newArray[i]=arr[i];
            }
            arr=newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
