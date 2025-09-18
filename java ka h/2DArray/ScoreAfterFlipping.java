import java.util.Scanner;
public class ScoreAfterFlipping {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("enetr the no of rows = ");
         int row = sc.nextInt();
         System.out.print("enetr thge no col = ");
         int col = sc.nextInt();
         int[][] mat = new int[row][col];
         System.out.println("enter the values o and 1 allowed only=");
        for(int i = 0; i<row;i++){
            for(int j = 0 ; j< col;j++){
                mat[i][j]= sc.nextInt();
            }

        }    System.out.println("ur");
        for(int i = 0 ; i<row;i++){
            for(int j=0  ;j<col;j++ ){
                System.out.print(mat[i][j] +" ");
            }System.out.println();
        }
        for(int i=0;i<row;i++){
            if(mat[i][0]==0){
                   for(int j = 0 ;j<col;j++){
                        if(mat[i][j]==0) mat[i][j]=1;
                        else mat[i][j]=0;
                }
            }
        }
        System.out.println("ur");
        for(int i = 0 ; i<row;i++){
            for(int j=0  ;j<col;j++ ){
                System.out.print(mat[i][j] +" ");
            }System.out.println();
        }

        for(int j = 1; j<col;j++){
            int zero = 0 ,one = 0;
            for(int i = 0 ; i<row;i++){
                if(mat[i][j]==0) zero++;
                else one++;
            }
        
        if(zero>one){
            for(int i =0;i<row;i++){
                if(mat[i][j]==0) mat[i][j]=1;
                else mat[i][j]= 0;
            }
        }
    }
    System.out.println("ur");
    for(int i = 0 ; i<row;i++){
        for(int j=0  ;j<col;j++ ){
            System.out.print(mat[i][j] +" ");
        }System.out.println();
    }
    int sum = 0;
    for(int i = 0 ;i<row;i++){
        int x = 1;
        for(int j = col-1;j>=0;j--){
            sum= sum+ mat[i][j]*x;
            x*=2;
        }
    }
    System.out.print("enetr the value = "+sum);
    sc.close();
         }
}
