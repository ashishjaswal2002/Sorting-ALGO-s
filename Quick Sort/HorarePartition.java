public class HorarePartition {
    //Quick Sort Can also be done using this Partition.

    public static void main(String[] args) {
        int arr[] = {5,21,2};
        int n = arr.length;

        horarePart(arr,0 , n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static void horarePart(int arr[],int low,int high){
        int i= low-1;
        int pivot = arr[low];
        int j = high+1;

        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            
            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j)
            return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }


    }
}
// Time Complexity O(n).
//Horare is not a good version as compared to Lomuto Partition.