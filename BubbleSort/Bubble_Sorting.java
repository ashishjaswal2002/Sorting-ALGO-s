package BubbleSort;


public class Bubble_Sorting{//👈Your File name and class Name should be same


    public static void main(String[] args) {
        int arr[] = { 99,60,40,30};
        int n = arr.length;

        solJava(arr, n);
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }

    static void solJava(int arr[], int n) 
    {
        // for (int i = 1; i < n; i++) {

        //     for (int j = 0; j < n; j++)
        //         if (arr[i] < arr[j]) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }

        // }
        // Little bit Optimization...
        boolean flag = true;//This is for when you never enter in the inner loop...
        //Please Dry run to get better understanding..
        for(int i=0;i<n;i++){
            flag = false;

            for(int j=0;j<n-1;j++){
                // Swap the Element..
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                flag= true;
            }
            if(flag ==false)
            break;
        }

    }

// Time Complexity -0(n2)
//   Stable Algorithm...
}
