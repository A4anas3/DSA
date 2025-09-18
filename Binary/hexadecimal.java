import java.util.Scanner;
public class hexadecimal{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("entyeer the the no = ");
        int n = sc.nextInt();
        StringBuilder hex = new StringBuilder();

        while(n>0){
            int parity = n%16;
            if(parity<10){
                hex.insert(0,parity);
            }else{
                hex.insert(0,(char)(55+parity));
            }
            n/=16;
          
        }System.out.print(hex);
        sc.close();
    }
}