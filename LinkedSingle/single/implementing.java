package LinkedSingle.single;
public class implementing{
    public static void main(String[] args) {
        SingleList l = new SingleList();
     
        l.insertAtStart(2);
        l.insertAtEnd(4);
        l.insertAtIdx(3,2);
        // l.deleteAtIdx(1);
        l.set(9,1);
        System.out.println("idx"+l.getIdx(2));
        l.display();


        
    }

    public static void print(Node node){
        if(node==null) return;
        System.out.println(node.val);
        node=node.next;
        print(node);
    }
}
