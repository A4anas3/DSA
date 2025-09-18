package circular;
class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
    }

}

public class slc {
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        System.err.println(a.val);
    }
}
