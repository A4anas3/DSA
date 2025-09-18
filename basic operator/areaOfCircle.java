import java.util.Scanner;
class AreaFormula{
    public float AreaofCircle(int r){
        float sum ;
        sum = (22F/7) *r*r ;
        return sum;
    }
}
public class areaOfCircle{
    public static void main(String[] args){
        AreaFormula yes = new AreaFormula();
        
        Scanner in = new Scanner(System.in);
        System.out.print("enter the radius of circle = ");
        int r = in.nextInt();
       // float ans = yes.AreaofCircle(r);
          System.out.println("area of circle is = " +   yes.AreaofCircle(r));
    in.close();
    }
}