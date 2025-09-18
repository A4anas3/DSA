
package BinarySearch;
public class LowerBound{
    public static void lower(int[] nums,int target){
        int i= 0,j=nums.length-1;
        int idx = Integer.MAX_VALUE;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(nums[mid]>=target){
                idx =Math.min(idx, mid);
                j = mid-1;
            }else{
                i = mid+1;
            }
        }System.out.println(idx);
    }
    public static void main(String[] args){
        int[] arr = {0,2,2,2,3,4,7,9,10,22};
        lower(arr, 3);

    }
    
}
