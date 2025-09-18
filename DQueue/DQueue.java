package DQueue;

import java.util.EmptyStackException;


 class Node{
        int val;
         Node next;
         Node prev;
        public Node(int val){
            this.val=val;
        }
    }
public class DQueue {
    private Node head;
    private Node tail;
    private int size=0;
    public void insertAtFront(int val){
        Node temp= new Node(val);
        if(head==null){
            head=temp;
            tail=head;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    public void inserAtEnd(int val){
        Node temp = new Node(val);
        if(tail==null){
            tail=temp;
            head=tail;
        }else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;

    }
    void display(){
        if(size==0) throw  new Error("Empty");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
    }
    
    void deleteFront() throws Exception{
        if(size==0) throw new Exception("emty");
        if(size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }
    void deleteEnd(){
        if(size==0) throw new EmptyStackException();
        if(size==1){
            head=null;
            tail=null;
            size--;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }
    void getFront(){
         if(size==0) throw  new Error("Empty");
         System.out.println(head.val);
        
    }
    void getEnd(){
         if(size==0) throw  new Error("Empty");
         System.out.println(tail.val);
    }
    boolean isEmpty(){
        return size==0;
    }
    int size(){
        return size;
    }
    
    public static void main(String[] args) {
        DQueue q=new DQueue();
        q.insertAtFront(5);
        q.inserAtEnd(8);
        q.deleteEnd();
      System.out.println(q.size());
        q.display();
    }
   
    
}
