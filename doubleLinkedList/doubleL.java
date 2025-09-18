package doubleLinkedList;

class dNode {
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
    
}
public class doubleL{
    public static void main(String[] args){
        dNode a = new dNode(4);
        dNode b = new dNode(3);
        dNode c = new dNode(2);
        dNode d= new dNode(1);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        System.out.println(a.val);
        System.out.println(a.next.val);
        sh z = new sh();
        z.display();
        
    }

}