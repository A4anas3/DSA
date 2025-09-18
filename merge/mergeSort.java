package merge;


public class mergeSort {
    private static void join(int[] b,int[] c,  int[] a){
        int len1= b.length;
        int len2= c.length;
        int i=0,j=0,k=0;
        while(i<len1 && j<len2){
            if(b[i]<=c[j]){
                a[k]=b[i];
                i++;
            }else{
                a[k]=c[j];
                j++;
            }
            k++;
        }
        if(i==len1){
            while(j<len2){
                a[k]=c[j];
                j++;
                k++;
            }
        }
        if(j==len2){
            while(i<len1){
                a[k]=b[i];
                i++;
                k++;
                
            }
        }

    }
    private static  void merge(int[] a){
        int n = a.length;
        if(n<=1) return;
        int[] b = new int[n/2];
        int[] c = new int[n-n/2];

        for(int i=0;i<n/2;i++){
            b[i]=a[i];

        } 

        for(int i =0;i<n-n/2;i++){
            c[i]=a[n/2+i];
            
        } 
        merge(b);
        merge(c);
        join(b,c,a);
        b=null;
        c=null;



    }
    public static void main(String[] args){
        int[] a= {2,3,1,2,3,4,5,6,7,8};
        merge(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");

            
        }

    }
    
}
