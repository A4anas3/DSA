//WAP to find the duplicate elements from the given array of elements.
import java.util.ArrayList;
public class Dublicate {
    public static void main(String[] args){
        int[] element = {1,2,3,2,5,6,0,7,8,9,10,1,3};
        ArrayList<Integer>Dublicate = new ArrayList<>();
        for(int i = 0 ; i<element.length;i++){
            boolean isDublicate=false;
            for(int k = 0;k<Dublicate.size();k++){
                if(element[i]==Dublicate.get(k)){
                  isDublicate = true;
                  break;
                }
            }
            if(isDublicate==false){
                for(int j = i+1;j<element.length;j++){
                    if(element[i]==element[j]){
                        Dublicate.add(element[i]);
                        break;
                    }
                }
            }
        }
        System.out.print("output = " + Dublicate);
    }
}
