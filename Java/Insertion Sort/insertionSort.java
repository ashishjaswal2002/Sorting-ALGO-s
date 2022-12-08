

public class insertionSort {//👈Your File name and class Name should be same

    public static void main(String[] args) {
        
        int arr[] ={34,23,22,12,44};
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

//Just Testing Features...


// Star this repository to show some support and follow me to get awesome content