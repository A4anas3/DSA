

public class SmallestpositiveMissing {
    public static void main(String[] args ){
        int[] arr = {1,2,3,5,6,7,8,9};
        int expected = 1;
        for(int i = 0 ; i<arr.length;i++){
            if(expected==arr[i]){
                expected++;
            }
            else{
                break;
            }
        }
        System.out.println("positive "+expected);

    }
}
