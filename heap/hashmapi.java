package heap;
import java.util.HashMap;

public class hashmapi {
    public static void main(String[] args) {
        HashMap<String,Integer> h= new HashMap<>();
        h.put("Apple", 10);
        h.put("Banana", 5);
        h.put("Orange", 7);
        for (Object elem : h.entrySet()) {
            System.out.println(elem);
            
        }

       

    }
    
}
