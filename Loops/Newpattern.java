import java.util.Scanner;
public class Newpattern{
    public static void make(int m){
        for(int i = 0 ; i<m;i++){
            for(int j = 0;j<=m-1-i;j++){
                // System.out.print("* ");
             //   System.out.print(j +1 +" ");
            // System.out.print((char)(j+65) + " ");
            System.out.print((char)(i+ 65) + " " );
            }System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
        System.out.print("enter the dimeuigvug = ");
        int dimension = sc.nextInt();
        make(dimension);
          System.out.print("press greter than 1 to gain calculate");
          n = sc.nextInt();
        }while(n==1);
        sc.close();
}
    }
