import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
public class sortZeroOne {
    /* public static void sort(ArrayList<Integer>arr){
        int one = 0,zero=0;
        for(int i = 0 ; i<arr.size();i++){
            if(arr.get(i)==1){
                one++;
            }else{
                zero++;
            }
        }
        for(int i = 0;i<arr.size();i++){
            if(i<zero){
            arr.set(i,0);
        }else{
            arr.set(i,1);
        }
    }
    } */


    public static void goodsort(ArrayList<Integer>arr){
       int i = 0 , j = arr.size()-1;
        while(i<j){
           
            if(arr.get(i)==0){
                i++;
            }
            else if(arr.get(j)==1){
                j--;
            }
          else  if(arr.get(i)>arr.get(j)){
                int temp = arr.get(i);
                   arr.set(i,arr.get(j));
                   arr.set(j,temp);
                   i++;
                   j--;
                }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>(7);
        for(int i = 0; i<7;i++){
            arr.add(i,sc.nextInt());
    }
    // Collections.sort(arr);
    goodsort(arr);
    for(int i = 0;i<arr.size();i++){
        System.out.print(arr.get(i));
    }
    sc.close();
}
}
