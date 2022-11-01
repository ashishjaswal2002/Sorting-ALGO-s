

public class Selection_sort {
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
   //Time Complexity is
       


    
    
}
