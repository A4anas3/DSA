package stack;
class imp{
    private int[] a = new int[5];
    private int idx = 0;
    void push( int x) throws Exception{
        if(isFull()) throw new Exception("stack is full");
        else{
            a[idx++]=x;
            
        }
    }
    int peek() throws Exception{
        if(isEmpty()) throw new Exception("stack is empty");
        return a[idx-1];
    }
    void display() throws Exception{
        if(isEmpty()) throw new Exception("stack is empty");
        for(int i=idx-1;i>=0;i--){
            System.out.print(a[i]+" ");

        }
    }
    boolean isEmpty(){
        return (idx==0);
    }
    boolean isFull(){
        return (idx==a.length);
    }
    int size(){
        return idx;
    }
    int pop()throws Exception{
        if(isEmpty()) throw new Exception("empty");
        idx--;
        int b = a[idx];
        a[idx]=0;
        return b;


    }
}
public class arrayImp {
    public static void main(String[] args) {
        imp p = new imp();
        try{
        p.push(9);
        p.display();
        System.out.println(p.peek());
        System.err.println(p.pop());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        p.isFull();
       
    }
    
}
