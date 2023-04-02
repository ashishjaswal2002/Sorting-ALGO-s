#include <iostream>
using namespace std;

void mergeFunction(int arr[],int low,int mid,int high){
     

     int n1 = mid-low+1;
     int n2 = high-mid;
  

   
      
     int left [n1],right[n2];
    
    //Store the elements before middle
    for(int i=0;i<n1;i++){
     
     left[i] = arr[low+i];

    }
    //Store the elements after middle
    for(int i=0;i<n2;i++){
        right[i] = arr[mid+i+1];
    }

   //Now next part------>
   int i=0,j=0,k=low;


    while (i<n1 && j<n2)
    {
       if(left[i]<=right[j]){
        arr[k] = left[i];
        i++;
        k++;
       }else{
        arr[k] = right[j];
        k++;
        j++;
       }
    }
    //for the remianing elements of the array
    while(i<n1){
        arr[k] = left[i];
        i++;
        k++;
    }
    while(j<n2){
        arr[k] = right[j];
        j++;
        k++;
    }
    
}

//Merge Sort
void mergeSort(int arr[],int l,int r){
    
    if(r>l){
        int m = l+(r-l)/2;

        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        mergeFunction(arr,l,m,r);
    }
}

int main(){



    int n;
    cin>>n;
    cout<<"Enter the number of elements "<<endl;

    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
  

  cout<<"Elements before Sorting"<<endl;
  for(int i=0; i<n; i++){
    cout<<arr[i]<<" ";
  }

   cout<<"Elements after Sorting"<<endl;

   mergeSort(arr,0,n-1);

   for(int i=0; i<n; i++){
    cout<<arr[i]<<" ";
   }
     

}
//Time complexity theta(log n);
//Space complexity theta(logn)