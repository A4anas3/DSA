
import java.util.Scanner;
public class AbsoluteValue {
    void absolute(int a){
        if(a<0) System.out.println("absolute nop is " + (-a));
        else System.out.println("absolute no is "+ a);
    }
     public static void main(String[] args){
         Scanner obj = new Scanner(System.in);
         while(true){
         System.out.print("enter the real no ");
         int no = obj.nextInt();
         AbsoluteValue sc = new AbsoluteValue();
         sc.absolute(no);

         obj.nextLine();
         System.out.print("\nwrite \"yes\" for another \n else write \"no\" ");
         String tell = obj.nextLine();
         if(tell.equals("yes")){
            System.out.println("next program");
           

         }else if(tell.equals("no")){
            System.out.println("proogram is cxlose");
            break;
         }else{
            break;
         }


     }obj.close();
  }
}
