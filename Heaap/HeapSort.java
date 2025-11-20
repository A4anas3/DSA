package Heaap;

class sort{
    int[] arr;
    int size;
    sort(int c){
        arr=new int[c];
        size=0;
    }
    public int peek() throws Exception{
        if(size==0) throw new Exception("empty ");
        return arr[0];
    }
    public void add(int val) throws Exception{
        if(size==arr.length) throw new Exception("full size");
        arr[size++]=val;
        upheapify(size-1);
    }
     void upheapify(int idx){
        if(idx==0) return;
        int p=(idx-1)/2;
        if(arr[p]>arr[idx]){
            swap(arr,idx,p);
            upheapify(p);
        }
    }
    void swap(int[] a,int i,int j){
        int tem=a[i];
        a[i]=a[j];
        a[j]=tem;
    }
    int size(){
        return size;
    }
  int remove() throws Exception{
    if(size==0) throw new Exception("emoty");
    int peek=arr[0];
    swap(arr,0,size-1);
    size--;
    downHeapify(0);
    return peek;

  }
 void downHeapify(int id){
    if(id>size) return;
    int p=id;
    int lc=2*p+1;
    int rc=2*p+2;
    if(lc<size && arr[lc]<arr[p]) p=lc;
    if(rc<size && arr[lc]<arr[p]) p=rc;
    if(p!=id){
        swap(arr, id, p);
        downHeapify(p);
    }

 }

}
public class HeapSort {
    public static void main(String[] args) throws Exception {
        sort a= new sort(10);
        a.add(2);
       
        System.out.println(a.peek());
        System.out.println(a.remove());
        System.out.println(a.size());
    }


    
}
