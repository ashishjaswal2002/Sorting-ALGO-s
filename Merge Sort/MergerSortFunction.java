public class MergerSortFunction {

  public static void main(String[] args) {
    int arr[] = { 10,3 ,3,1,2,1 };
   int n  = arr.length;
    int low = 0;
    int r = n-1;

    mergeSort(arr, low, r);
    for (int x : arr) {
      System.out.print(x + " ");
    }

  }

static  void mergeSortFunction(int arr[], int low, int mid, int high) {
    // Size of the Array of our left and right.
    int n1 = mid - low + 1;
    int n2 = high - mid;

    int left[] = new int[n1];
    int right[] = new int[n2];
    // Add all the elements in the Left array.
    for (int i = 0; i < n1; i++) {
      left[i] = arr[i+low];
    }
    for (int j = 0; j < n2; j++) {
      right[j] = arr[mid+1+j];

    }
    // After adding all the elements We are going to compare to each other and merge
    // them
    int i = 0, j = 0, k = low;
    while (i < n1 && j < n2) {
        if (left[i] <= right[j]) 
         arr[k++] = left[i++];
         else 
         arr[k++] = right[j++];
        
      }

    
  // Now for the remaining elements.
  while(i<n1)
   {
    arr[k++] = left[i++];

  }
  while(j<n2)
  {
    arr[k++] = right[j++];

  }

    }

    static void mergeSort(int arr[] ,int low,int r){
       if(r>low){
        
        
       int mid = low+(r-low)/2;

   mergeSort(arr, low, mid);
   mergeSort(arr, mid+1,r);
   mergeSortFunction(arr, low, mid,r);
     
       }
  }

}
// Time Complexity Theta(nlogn).
// Stable Algorithm..