public class HorarePartition {//👈Your File name and class Name should be same
    //Quick Sort Can also be done using this Partition.

    public static void main(String[] args) {
        int arr[] = {2,1,5};
        int n = arr.length;

        QuickSortH(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    static int  horarePart(int arr[],int low,int high){
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
            return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }


    }
    static void QuickSortH(int arr[],int l,int h){
        if(l<h){
            int p = horarePart(arr, l, h);

            QuickSortH(arr, l, p);
            QuickSortH(arr, p+1, h);

        }
    }
}
// Time Complexity O(n).
//Horare is not a good version as compared to Lomuto Partition.