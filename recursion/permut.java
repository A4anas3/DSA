import java.util.ArrayList;
import java.util.List;

public class permut {
    static  List<String>K=new ArrayList<>();
        public static  void permuti(String s,String b){
            if(s.length()==0){
                K.add(b);
                return;
            }
            for(int i = 0 ; i<s.length();i++){
                char ch = s.charAt(i);
                String left  = s.substring(0,i);
                String right = s.substring(i+1);
                permuti(left+right,b+ch);
            }
        }
        public static void main(String[] args){
            // Scanner sc = new Scanner(System.in);
        
            K.clear();
            String s = "abb" ;
            permuti(s,"");
            System.err.println(K);
        
    }
    
}
