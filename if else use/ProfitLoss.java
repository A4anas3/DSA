import java.util.Scanner;

public class ProfitLoss{
    public void profitLoss(float a , float b){
        float s;
        if (a>=b){
            System.out.println("profit is = " + (a-b));
        }else{
            System.out.println("loss is = " + (b-a));
        }
    }
    public static void main(String[] args){
         Scanner obj = new Scanner(System.in);
         ProfitLoss op = new ProfitLoss();
        while (true){
         System.out.print("\nenter the selling price = ");
         float n = obj.nextFloat();
         System.out.print(" \n enter the cost price = ");
         float cost = obj.nextFloat();
         op.profitLoss(n,cost);
         obj.nextLine();

         System.out.print("enter \"yes\" to program again \n write \"no\" to stop ");
         String tell = obj.nextLine();
         if(tell.equals("yes")){
            System.out.println("new program started");
         }
         else if(tell.equals("no")){
            System.out.println("program end");
                break;
            }
        else{
                System.out.println("loo like you have wrong key \n Error! Error! \n please again run");
                break;
            }
         }obj.close();
        }

    }
