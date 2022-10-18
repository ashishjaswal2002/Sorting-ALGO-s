package BubbleSort;


public class Bubble_Sorting{


    public static void main(String[] args) {
        int arr[] = { 2,4,2,5,3};
        int n = arr.length;

        solJava(arr, n);
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }

    static void solJava(int arr[], int n) 
    {
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < n; j++)
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        }
    }

// Time Complexity -0(n2)
//   Stable Algorithm...
}
