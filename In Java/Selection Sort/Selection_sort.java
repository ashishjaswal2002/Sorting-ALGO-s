

public class Selection_sort {//👈Your File name and class Name should be same
    public static void main(String[] args) {
        int arr[] = {3,2,1,0};
        int n = arr.length;

        solution(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
   static void solution(int arr [],int n){
      
    for(int i=0;i<n;i++){
        int min_index = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_index]){
                min_index = j;
            }
        }

        //Swap the min index because our min index is smallest.
        int temp = arr[i];
        arr[i]= arr[min_index];
        arr[min_index ]= temp;

    }

   }
   //Time Complexity is O(n^2)
   //Selection sort is a relatively simple algorithm to understand and implement. However, it is not very efficient for sorting large lists. There are other sorting algorithms, such as quicksort and merge sort, that have a better time complexity and are therefore more efficient for sorting large lists.
       


    
    
}
