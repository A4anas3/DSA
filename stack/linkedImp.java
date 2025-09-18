package stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
class stack{
    Node head;
    int id =0;
    void push(int val){
        if(id==0) head= new Node(val);
        else{
            Node tem = new Node(val);
            tem.next=head;
            head=tem;

        }
        id++;
    }
    int size(){
        return id;
    }
    int pop(){
        if(id==0) throw new RuntimeException("empty");
        int tem = head.val;
        head = head.next;
        id--;
        return tem;
    }
    int peek(){
        if(id==0) throw new RuntimeException("empty");
        int tem = head.val;
        
        return tem;
    }
    void display(){
        if(id==0) throw new RuntimeException("error");
        Node tem = head;
       for(int i = 0;i<id;i++){
        System.out.println(tem.val);
        tem=tem.next;
        
       }
    }

}

public class linkedImp {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(9);
        System.out.println(st.peek()+"");
        System.out.println( st.pop());
       
        // System.out.println( st.pop());
        st.push(9);
        st.push(6);
        st.display();
    }
    
}
