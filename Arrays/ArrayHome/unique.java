// Q11. Find the unique number in a given Array where all the elements are being repeated twice with one value
// being unique.
import java.util.Arrays;
public class unique {
    public static void main(String[] args){
    int[] a = {1,1,1,2,2,3,3,3,4,5,6,5,6,5,6,};
     Arrays.sort(a);
     for(int i = 0 ; i<a.length;i++){
          if(i==0 && a[i]!=a[i+1] ){
            System.out.println("output is = " + a[i]);
            break;
          }else if(i== a.length-1 && a[i]!=a[i-1]){
            System.out.println("output is = " + a[i]);
            break;
          }else if(a[i]!=a[i+1] && a[i]!=a[i-1]){
            System.out.println("output is = " + a[i]);
            break;
          }
    }    
    }}

            