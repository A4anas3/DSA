package LinkedSingle.single;

public class SingleList{
    private Node head;
    private Node tail;
    private int size;
     void insertAtStart(int val){
         Node temp = new Node(val);
        if(tail==null){
            head=tail=temp;
        }
        else{ temp.next=head;
        head=temp;
     }
       
       
        size++;
    }
     void insertAtEnd(int val){
          Node temp = new Node(val);
        if(head==null){
          head=tail=temp;
        }else{
      
        tail.next=temp;
        tail=temp;}
       
        size++;
    }
    void insertAtIdx(int val,int idx) throws IndexOutOfBoundsException{
        if(idx>size || idx<0) throw new IndexOutOfBoundsException();
        else if(idx==0){
            insertAtStart(val);
            return;
        }
        else if(idx==size){
            insertAtEnd(val);
            return;
        }
        Node tempr=head;
        Node temp = new Node(val);
        for(int i=0;i<idx-1;i++){
            tempr=tempr.next;
            
        }
       Node p =  tempr.next;
       tempr.next=temp;
       temp.next=p;

        
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;

        }
    }

    void deleteAtstart() throws IndexOutOfBoundsException{
        if(head==null) throw new IndexOutOfBoundsException("not present");
        else if(head==tail){
            head = tail =null;
        }
        else{
            head=head.next;
        }
        size--;
    }
    void deleteAtEnd()throws IndexOutOfBoundsException{
        if(tail==null) throw new IndexOutOfBoundsException("empty");
        else if(head == tail) head=tail=null;
        else{
            Node temp =head;
            for(int i=0;i<size-1;i++){
                temp =temp.next;

            }
            temp.next=null;
            tail=temp;
        }
        size--;
    }
    void deleteAtIdx(int idx) throws IndexOutOfBoundsException{
        if(idx<0 || idx>size-1)  throw new IndexOutOfBoundsException("out of bound");
        else if(idx==0){
            deleteAtstart();
        }
        else if(idx==size-1){
            deleteAtEnd();
        }
        else{
           Node temp =head;
           for(int i=0;i<idx-1;i++){
            temp=temp.next;
           }
           temp.next=temp.next.next;

        }}

        void set(int val,int idx)throws IndexOutOfBoundsException{
            if(idx<0 || idx>size-1) throw new IndexOutOfBoundsException();
            else if(idx==0){
                head.val = val;

            }else if(idx==size-1){
                tail.val=val;
            }else{
                Node temp = head;
                for(int i=0;i<idx;i++){
                     temp=temp.next;
                }
                temp.val=val;
            }
        }
        
        int getIdx(int idx){
            if(size-1==idx) return tail.val;
            else if(idx<0 || idx>=size) {
                return -1;
            }
            else if(idx==0) return head.val;
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp=temp.next;

            }
            return temp.val;
        
        }
    }

    

