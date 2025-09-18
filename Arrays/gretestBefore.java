public class gretestBefore {
    public static void main(String[] args ){
        int[] a = {1,13,18,1,99,20,2};
        int n = a.length;
        int[] ans = new int[n];
        ans[n-1]=-1;
       int  nge = a[n-1];
        for(int i = n-2 ;i>=0;i--){
            ans[i]= nge;
            nge= Math.max( nge,a[i]);
            
        }
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }
}
