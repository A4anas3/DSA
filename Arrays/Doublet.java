import java.util.Scanner;
import java.util.ArrayList;
public class Doublet {
public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer>arr = new ArrayList<>(6);
    for(int i = 0;i<6;i++){
        arr.add(sc.nextInt());
    }
 
     System.out.print("enter the value = ");
     int n = sc.nextInt();
     int[] ans = new int[2];
     boolean flag = false;

     for(int i = 0 ; i<arr.size();i++){
      
        for(int j = i+1;j<arr.size();j++){
            if(arr.get(i)+arr.get(j)==n){
               // System.out.println(i +" , "+ j);
               ans[0]=i;
               ans[1]= j;
               flag = true; 
               break;
            }
        } 
        
         if (flag==true) {
             break;
       }
     }
    if(flag == true ){
        System.out.print(ans[0] + " " + ans[1] );
    }else{
        System.out.print("not fou7nd");
    }
    
sc.close();
}
}
