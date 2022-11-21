public class Lomuto_Part {
    
    public static void main(String[] args) {
     int arr[] = {10,80,30,90,40,50,70};
     int n = arr.length;
   
     lomutoPartition(arr, n);
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
     }
    }
    static void  lomutoPartition(int arr[],int n){
        int l = 0;
        int h = n-1;
        int pivot = arr[h];
        
        
         
         

        int i = l-1;
        for(int j=l;j<=h-1;j++){
          if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
        }
       int temp = arr[i+1];
       arr[i+1] = arr[h];
       arr[h] = temp;

    }
}
