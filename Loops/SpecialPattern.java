import java.util.Scanner;
public class SpecialPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row ");
        int n = sc.nextInt();
        /*    for(int i = 1; i<=n;i++){
            for(int j = 1;j<=n;j++){
     if(i ==j || i+j==n+1){
            System.out.print("* ");
        }else{
            System.out.print("  ");   
        } */ 
      for(int i = 1;i<=n;i++){
        for(int j =1;j<=i;j++){
    
        if((i+j)%2 ==0){
            System.out.print("1");
        }else{ System.out.print("0");
    }
     }System.out.println();
        }sc.close();
    }
}