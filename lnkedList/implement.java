package lnkedList;

class Node {
    public int val;
    public  Node next;
    
    public Node(int val){
           this.val=val;
    }
}
public class implement{
    public static void main(String[] args){
        Node a=new Node(2);
        Node b=new Node(3);
        a.next = b;

        System.out.println(a.next);
        System.out.println(b);
    }
}