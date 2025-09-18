package lnkedList;

import java.util.Scanner;


class SinglyLinkedList {
    private  Node tail;
    private  Node head;
    private  int size;
    

     void inser(int val) {
        Node tem = new Node(val);
        if(head==null) head=tail=tem;
        else{
            tail.next= tem;
            tail=tem;
        }
              size++;
          }
     void insertstart(int val){
        Node tem = new Node(val) ;
        if(head==null) head=tail=tem;
        else{
            tem.next=head;
            head=tem;
        }
        size++;
    }
    //insert at any idx
    public void insertAtidx(int val,int idx) {
        Node temp=new Node(val);
        Node curr = head;
        if(idx<0 || idx>size){
            System.out.println("error out of bound");
            return;
        }
        if(idx==0){

          insertstart(val);
          return;
        }
        else if (idx==size) {
            inser(val);
            return;
    }

        for(int i = 1 ; i< idx;i++){
            curr=curr.next;
        }
      /*   if (curr == null) {
            System.out.println("Error: Index out of bounds");
            return;
        }*/
        temp.next=curr.next;
        curr.next=temp;
        size++;
       

    }
        
    public void display(){
        Node tem=head;
        while(tem!=null){
            System.out.print(tem.val);
            tem=tem.next;
        }System.out.println();
    }
    public int size(){
        return size;
    }
    int get(int idx ){
         Node temp = head;
        if(idx< 0|| idx>size-1) return -1;
        else if(idx==0) return head.val;
        else if(idx==size-1) return tail.val;
        else{
            for(int i=0;i<idx;i++){
                temp = temp.next;

            }
            return temp.val;
        }

    }
    // set

    public void set(int val,int idx) throws Error{
        Node temp = head;
        if(idx<0 || idx>=size) throw new Error("out od bound");
        else if(idx==size-1) tail.val=val;
        else if(idx==0) head.val=val;
        else{
            for(int i = 0;i<idx;i++){
                temp=temp.next;

            }
            temp.val=val;
        }
    }

//delete
   void deleteHead() {
      
      if(head==null) throw new Error("empty");
      head=head.next;
       size--;

}
   void deleteAtidx(int idx) {
     Node temp = head;
      if(idx>=size || idx<0) {
         throw new Error("out odf bound");
        }
     else if(idx==0){
        deleteHead();
        size--;
        return;
      }
    
        for(int i=1;i<idx;i++){
        temp=temp.next;

      }
      if(temp.next==tail) tail=temp;
      temp.next=temp.next.next;
       size--;

}

}
public class imp{
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            int val = sc.nextInt();
            list.inser(val);
    }
    list.display();

    list.insertAtidx(4, 5);
    list.display();
    System.err.println(list.get(0));
    list.deleteHead();
    list.deleteAtidx(3);
    list.inser(1);
    list.display();
    sc.close();

    }
}
