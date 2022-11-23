public class Lomuto_Part {
    
    public static void main(String[] args) {
     int arr[] = {10,80,30,90,40,50,70};
     int n = arr.length;
   
    QuickSort(arr, 0, n-1);
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
     }
    }

    static int    lomutoPartition(int arr[],int l,int h){

        int i =l-1;
        int pivot = arr[h];

        for(int j=l;j<=h-1;j++){
           if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
           }

        }
        int temp  = arr[i+1];
        arr[i+1]= arr[h];
        arr[h] = temp;
  
        return i+1;

    }
    static void QuickSort(int arr[],int l,int h){
     if(l<h){
      int p = lomutoPartition(arr, l, h);
      QuickSort(arr, l, p-1);
      QuickSort(arr, p+1, h);
     }

      
    }
}
