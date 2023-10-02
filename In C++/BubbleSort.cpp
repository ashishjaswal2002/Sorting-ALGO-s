# include <iostream>
using namespace std;

void bubble_sort(int arr[],int n);
int main(){


    int n;
    cout<<"Enter Number of Elements"<<endl;
    cin>>n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }


   cout<<"Elements before Sorting"<<endl;

   for(int i=0;i<n;i++){
    cout<<arr[i]<<" ";
   }
   cout<<" "<<endl;

  //Calling the Sorting function
  bubble_sort(arr,n);
   cout<<"Elements after Sorting"<<endl;
   for(int i=0;i<n;i++){
    cout<<arr[i]<<" ";
   }



}
 void bubble_sort(int arr[],int n){

    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1])
            swap(arr[j],arr[j+1]);
        }
    }
    
 }
 // Time Complexity -0(n2)
//   Stable Algorithm...