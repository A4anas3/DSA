package doubleLinkedList;
class sh{
    private int size;
    private dNode head;
    private dNode tail;
    public void insertAtHead(int val){
        if(head ==null){
            head = new dNode(val);
            tail = head;
            size++;

        }else{
            dNode t = new dNode(val);
            t.next = head;
            head.prev = t;
            head = t;
            size++;

        }
    }
    public void insertAtTail(int val){
        dNode t = new dNode(val);
        if(tail==null){
             tail = head = t;
             size++;
        }
        else{
            tail.next = t;
            t.prev = tail;
            tail = t;
            size++;
        }
    }
    public void insert(int val,int idx){
        if(idx <0 || idx>size) throw new IndexOutOfBoundsException("invalid idx");
        else if(idx==0) insertAtHead(val);
        else if(idx==size) insertAtTail(val);
        else{
            dNode t = new dNode(val);
            dNode c = head;
            int i = 0;
            while(c!=null && i<idx-1){
                c = c.next;
                i++;

            }
            dNode n = c.next;
            t.next = n ;
            c.next = t;
            t.prev = c;
            n.prev = t;
            size++;

        }
        
    }
   public void display(){
        dNode t = head;
        while(t!=null){
            System.err.print(t.val+" <-> ");
            t = t.next;
        }
        System.out.println();
    }
   public void deleteAtHead() throws IllegalStateException{
       if(head==null) throw new IllegalStateException("invalid");
       else if(head.next ==null) {
        head = null;
        tail = null;
        size--;
       }
       else{
        head = head.next;
        head.prev = null;
        size--;
       }
    

   }
   public void deleteAtTail() throws IllegalStateException{
    if(tail==null) throw  new IllegalStateException("invalid");
    else if(tail==head){
        tail=null;
        head=null;
    }
    else{
        dNode t = tail.prev;
        t.next = null;
        tail.prev = null;
        tail = t;

    }
    size--;
   }
   public void delete(int idx) throws IllegalStateException{
    if(idx<0 || idx>= size) throw  new IllegalStateException("invalid");
    else if(idx ==0) deleteAtHead();
    else if(idx==size-1) deleteAtTail();
    else{
        int t = 0;
        dNode c = head;
        while(c!=null && t<idx-1){
            c = c.next;
            t++;
        }
        dNode n = c.next.next;
        c.next = c.next.next;
        n.prev = c;
        size--;

    }
   }
   public void getHead() throws IllegalStateException{
    if(head==null) throw new IllegalStateException("empty");
    System.out.println(head.val);
   }
   public void getTail() throws IllegalStateException{
    if(tail==null) throw new IllegalStateException("empty");
    System.out.println(tail.val);
   }
   public void get(int idx) throws IllegalStateException{
    if(idx<0 || idx> size) throw  new IllegalStateException("invalid");
    else if(idx ==0) getHead();
    else if(idx==size-1) getTail();
    else{
        int t = 0;
        dNode c = head;
        while( t<=idx-1){
            c = c.next;
            t++;
        }
        System.out.println(c.val);

    }
   }

   public void setHead(int val) throws IllegalStateException{
      if(head==null) throw new IllegalStateException("empty");
      head.val = val;
   }
   public void setTail(int val) throws IllegalStateException{
    if(tail==null) throw new IllegalStateException("empty");
    tail.val = val;
 }
 public void set(int val,int idx) throws IllegalStateException{
    if(idx <0 || idx>size) throw new IndexOutOfBoundsException("invalid idx");
    else if(idx==0) setHead(val);
    else if(idx==size-1) setTail(val);
    else{
        dNode c = head;
        for(int i = 0;i<idx-1;i++){
            c = c.next;
        }
        c.val = val;
    }}
   
   
    public int size(){
        return size;

    }


}

public class shortcut {
    public static void main(String[] args) {
        sh a = new sh();
        a.insertAtHead(2);
        a.insertAtHead(3);
        a.insertAtTail(1);
        a.insert(9, 0);
        a.display();
        a.deleteAtHead();
        a.deleteAtTail();
        a.insertAtTail(1);
        a.delete(1);
        a.insertAtHead(2);
        a.insertAtHead(3);
        a.display();
        a.getHead();
        a.getTail();
        a.get(1);
        a.setHead(0);
        a.setTail(0);
        a.set(55, 2);
        a.display();
       
        System.err.println(a.size());

    }
    
}
