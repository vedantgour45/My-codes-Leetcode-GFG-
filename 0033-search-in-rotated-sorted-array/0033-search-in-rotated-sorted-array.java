class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while(l<=r) {
            int mid = (l+r)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else if(arr[l] > arr[mid]) {
                if(target < arr[mid] || target >= arr[l]) {
                    r = mid-1;
                } else {
                    l = mid+1;
                }
            } else {
                if(target > arr[mid] || target < arr[l]) {
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}