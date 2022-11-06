import java.util.Scanner;

public class Using_LomutoPartition
{
    public static void main (String[] args) 
    {
        int arr[] = new int[]{10,80,30,90,40,50,70};
        
        int n = arr.length;

      
        
       

        iPartition(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

   
    }
    
    static void iPartition(int arr[], int l, int h)
    {   
       
        // Swap the pivot with the last element.
        int pivot = arr[h];


        
        

        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
 
    }
}
