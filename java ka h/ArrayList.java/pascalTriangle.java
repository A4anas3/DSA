import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class pascalTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size");
        int size = sc.nextInt();
        List<List<Integer>>L = new ArrayList<>();

        for(int i = 0;i<size;i++){
            List<Integer>k=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    k.add(1);
                }
                else{
                    k.add(L.get(i-1).get(j) + L.get(i-1).get(j-1));
                }
            }L.add(k);
        }
        for(int i = 0 ; i<size;i++){
            for(int j = 0;j<(L.get(i).size());j++){
                System.out.print(L.get(i).get(j));
            }System.out.println();
        }
    sc.close();
    }
}
