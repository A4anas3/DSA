package circular;


class cirL{
private Node head;
private  Node tail;
int size;
void insertAtHead(int val){
    if(head==null){
        head = tail= new Node(val);
        tail.next = head;
       
        size++;


    }
    else{
     Node t=new Node(val);
     t.next = head;
     head=t;
     tail.next = head;
     size++;
    }
}
void insertAtTail(int val){
    if(tail==null){
        head = tail= new Node(val);
        tail.next = head;
       
        size++;


    }
    else{
     Node t=new Node(val);
     tail.next = t;
     tail=t;
     tail.next = head;
     size++;
    }
}
public void insertAtidx(int val,int idx) {
    Node temp=new Node(val);
    Node curr = head;
    if(idx<0 || idx>size){
        System.out.println("error out of bound");
        return;
    }
    if(idx==0){

      insertAtHead(val);
      return;
    }
    else if (idx==size) {
        insertAtTail(val);
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

void display(){
    Node t =head;
    while(true){
        System.out.print(t.val +" ");
        if(t.next==head) break;
        t=t.next;
        
    }
}


}
public class imp {
    public static void main(String[] args) {
        cirL a = new cirL();
        a.insertAtHead(2);
        a.insertAtHead(3);
        a.insertAtTail(5);
        a.insertAtidx(6, 1);

        System.err.println(a);
        a.display();
    }
    
}
