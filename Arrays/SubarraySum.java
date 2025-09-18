public class SubarraySum {
    public static void main (String[] args){
        int[] a = {1,2,3,4,6,7,8};
        int  total = 0;
        for(int i=0;i<a.length;i++){
            total+=a[i];
        }
        int prefix= 0;

       int suffix;
        boolean flag = false;
        for(int i = 0 ; i<a.length;i++){
            prefix+=a[i];
            suffix = (total-prefix);
            if(prefix==suffix){
                flag= true;
            }

        }
        if(flag==true) System.out.print("yes ");
        else System.out.print("not");
    }
    
}
