

public class GoodProblem{
    public static void main(String[] args){
        int m = 4;
     /*    for (int i =1;i<=(2*m)-1;i++){
            System.out.print("*");
        }System.out.println();
        for (int i =1;i<=m;i++){
            for(int j = 1; j<=m-i;){
                System.out.print("*");
                j++;
            }
            for(int j = 1;j<=2*i-1;j++ ){
                System.out.print(" ");
            }
            for(int j = m-i;j>=1;j--){
                System.out.print("*");
            }System.out.println();
        } */

        for (int i =1;i<=(2*m)-1;i++){
            System.out.print(i);
        }System.out.println();
        for(int i = 1;i<=m-1;i++){
            for(int j = 1; j<=m-i;j++){
                System.out.print(j);
            }for(int j = 1; j<=2*i-1;j++){
                System.out.print(" ");
            }for(int j = m+i;j<=2*m-1;j++){
                System.out.print(j);
            }System.out.println();
        }
    }
}