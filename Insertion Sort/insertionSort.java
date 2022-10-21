

public class insertionSort {

    public static void main(String[] args) {
        
        int arr[] ={20,4,30,50,5,60};
        int n = arr.length;
        solution(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    static void solution(int arr[],int n){

        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]  =arr[j];
                j--;
            }

            arr[j+1]  = key;
        }
    }
    
}
// Time Complexity 
// Best Case- [1,2,3,4,5]; theta(n);
// Worst Case- when array is in Reverse Order
// [5,4,3,2,1] theta(n2);
// In General O(n2);


// Star this repo to get access this repo.