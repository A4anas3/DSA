import java.util.Scanner;

public class CharPattern{
    private  static void Char(int m , int n){
     for(int i = 0; i<m; i++){
        for (int j = 0 ; j< n ;j++){
            if(i==0 || i == m-1 || j== 0 || j==n-1){
         //   System.out.print((char)(j+65) + " ");
        //  System.out.print((char)(j+97)+ " ");
        System.out.print((char)(i+65)+ " ");}else{
            System.out.print("  ");
        }
        }System.out.println();
    }
}
    public static void main(String[ ] args){
        Scanner sc  = new Scanner (System.in);
      while(true){
        System.out.print("enter the no of rows ");
        int rows = sc.nextInt();
        System.out.print("Enter the no colums");
        int columns = sc.nextInt();
        System.out.println("your pattern id = ");
        Char(rows,columns);
        sc.nextLine();
        System.out.print("enter yes to again  start , no for end");
        String tell = sc.nextLine();
        if(tell.equals("yes")) {
            System.out.println("reenter");
        }else{
            System.out.println("end");
            break;
        }
    }sc.close();
 }
}