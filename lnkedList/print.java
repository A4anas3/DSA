package lnkedList;

public class print {
    private static void printi(Node head){
        Node tem = head;
        while(tem!=null){
            System.out.print(tem.val+" -->");
            tem=tem.next;
        }System.out.println();
    }
    private static void recur(Node head){
        if(head==null) return ;
        System.out.print(head.val+"-->");
        head=head.next;
        recur(head);
    }

    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(9);
        Node e=new Node(2);
        Node f=new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        printi(a);
        recur(a);
    }
}
