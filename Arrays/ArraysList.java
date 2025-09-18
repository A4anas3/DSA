import java.util.ArrayList;
// import java.util.Scanner;
public class ArraysList {
    public static void main(String[] args){
      ArrayList<Integer>arr=new ArrayList<>();
      arr.add(0,5);
      arr.add(1,3);
      arr.add(2,8);
      System.out.println(arr.get(0));
      for(int i = 0; i<arr.size();i++){
        System.out.println(arr.get(i));
      }
      arr.set(0,1);
      arr.add(90);
      arr.remove(1);
      for(int i = 0; i<arr.size();i++){
        System.out.println(arr.get(i));
      }
    }
}
