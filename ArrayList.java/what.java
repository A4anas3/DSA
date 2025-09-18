import java.util.ArrayList;
import java.util.List;
public class what {
    public static void main(String[] args){
     List<Integer>a = new ArrayList<>();
       a.add(5);a.add(3);a.add(0);
       List<Integer>b=new ArrayList<>();
         b.add(8);b.add(0);
       List<Integer>c=new ArrayList<>();
        c.add(9);c.add(6);c.add(0);
        List<List<Integer>> d= new ArrayList<>();
          d.add(a);d.add(b);d.add(c);
    for(int i =0;i<d.size();i++){
        for(int j = 0;j<d.get(i).size();j++){
     //System.out.println(d.get(i)+ " ");
    System.out.print(d.get(i).get(j)+ " ");
    }System.out.println();
}
    }
}
