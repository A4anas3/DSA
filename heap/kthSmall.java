package heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmall {
    public static void main(String[] args )
{
    int[] arr= {1,2,3,4,5,6,7,8}; 
    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int ele:arr){
        pq.add(ele);
        if(pq.size()>4) pq.remove();
    }
    System.err.println(pq.peek());

}    
}
