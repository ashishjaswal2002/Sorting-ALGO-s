#include <iostream>
#include <vector>
using namespace std;
void cyclicSort(vector<int>& nums) {
    int n = nums.size();
    for (int i = 0; i < n; ) {
        if (nums[i] != i + 1) {
            // Swap nums[i] with the element at the correct position
            int temp = nums[i];
            nums[i] = nums[temp - 1];
            nums[temp - 1] = temp;
        } else {
            i++;
        }
    }
}

int main() {
	vector<int> arr = {4, 3, 2, 1, 5};

	cout << "Original Array: ";
    for (int num : arr) {
      cout << num << " ";
    }
    cout << endl;

    cyclicSort(arr);

    cout << "Sorted Array: ";
    for (int num : arr) {
    	cout << num << " ";
    }
	cout << endl;

    return 0;
}
