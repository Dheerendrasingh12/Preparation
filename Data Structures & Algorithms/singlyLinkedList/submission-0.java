class LinkedList {

private static class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
    }
}
Node dummy;
Node tail;
int size;
    public LinkedList() {
        dummy=new Node(-1);
        tail=dummy;
        size=0;
    }

    public int get(int index) {
        if(index<0 ||index>=size){
            return -1;
        }
        Node newNode=dummy.next;
        for (int j=0;j<index;j++){
            newNode=newNode.next;
        }
        return newNode.val;
    }

    public void insertHead(int val) {
        Node newNode=new Node(val);
        newNode.next=dummy.next;
        dummy.next=newNode;
        if(size==0){
            tail=newNode;
        }
        size++;

    }

    public void insertTail(int val) {
        Node newNode=new Node(val);
        tail.next=newNode;
        tail=newNode;
        size++;

    }

    public boolean remove(int index) {
        if(index<0 || index>=size){
            return false;
        }
        Node newNode=dummy;
        for(int i=0;i<index;i++){
            newNode=newNode.next;
        }
        if(newNode.next==tail){
            tail=newNode;
        }
        newNode.next=newNode.next.next;
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
       ArrayList <Integer> values=new ArrayList<>();
        Node curr=dummy.next;
        int i=0;
        while(curr!=null){
           values.add(curr.val);
           curr= curr.next;
        }
        return values;

    }
}
