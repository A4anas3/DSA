//Q15. Count the number of triplets whose sum is equal to the given value x.
import java.util.Scanner;
public class triplet {
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
       System.out.print("enter the size = ");
       int size = sc.nextInt();
       int[] list = new int[size];
       for(int i = 0 ; i<size;i++){
        System.out.println("enter the "+ (i+1) + "value");
        list[i] = sc.nextInt();
       }
      int triplet = 0;
      System.out.print("enter tghe value = ");
      int target = sc.nextInt();
      for(int i = 0 ; i<size;i++){
        for(int j = i+1;j<size;j++){
            for(int k = j+1;k<size;k++){
                if(list[i]+list[j]+list[k]==target){
                    triplet++;

                }
            }
        }
      }
      System.out.println("no = "+ triplet);
      sc.close();
    }
}
