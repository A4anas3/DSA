import java.util.Scanner;

public class Triangle {
    public void triangle(int m){
        for(int i = 0 ; i<m; i++){
            for(int j = 0; j <=i;j++){
            //    System.out.print("* ");
            // System.out.print((j+1) + " ");
           // System.out.print((char)(j+65) + " ");
         //  System.out.print((char)(j+97) + " ");
       //  System.out.print(i+1 +" ");


       //mix char and int
       if(i%2==0){
        System.out.print(j+1 +" ");
       }
        else{
            System.out.print((char)(j+65) + " ");
        }
       
            }System.out.println();
        }
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        Triangle obj = new Triangle();
        while(true){
        System.out.print("enter the dimendion in integer");
        int dim = sc.nextInt();
        System.out.println(" ypurr out put");
        obj.triangle(dim);
        sc.nextLine();
        System.out.print("write yes for restart , otherwise no end ");
        String tell = sc.nextLine();
        if(!tell.equalsIgnoreCase("yes")){
            break;
        }
        }sc.close();
    }
}
