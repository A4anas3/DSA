import java.util.Scanner;

public class GradeCalculator{
    public static void calculator(float a){
        if(a>80) System.out.print("very ggood A grade");
        else if( a>60 && a<81) System.out.print(" good B");
        else if (a >40 && a< 61) System.out.print("pass c");
        else System.out.print("Fail");
    }
    public static void main(String[ ] args ){
        Scanner obj = new Scanner(System.in);

        while(true ){
            System.out.print(" enter your marks ");
            float marks = obj.nextFloat();
            calculator(marks);

            obj.nextLine();
            System.out.print("\n write yes for calculate again otherwise write no");
            String tell = obj.nextLine();
            if(tell.equals("yes"))  {
                System.out.println("start");
            }else{
                System.out.println("program end");
                break;
            }
        }obj.close();
 }
}
