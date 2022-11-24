class Solution {
    public void sortColors(int[] arr){
        int n = arr.length;
        int p1 = -1;
        int p2 = 0; 
        int p3 = n-1;
        
        while(p2<=p3) {
            if(arr[p2]==2) {
                swap(arr, p2, p3);
                p3--;
            } else if (arr[p2]==0) {
                p1++;
                swap(arr, p1, p2);
                p2++;
            } else {
                p2++;
            }
        }
    }
    
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



//Approach 1:
//      Arrays.sort(nums);
//      int ans[] = new int[nums.length];
//      for(int i=0; i<nums.length; i++){
//          ans[i] = nums[i];
//      }
   
//Apprpoach 2:
//         int zeros = 0;
//         int ones = 0; 
//         int twos = 0;
//         int  n = nums.length;
//         for(int i=0; i<n; i++){
//             if(nums[i] == 0){
//                 zeros++;
//             } else if (nums[i] == 1){
//                 ones++;
//             } else {
//                 twos++;
//             }
//         }
        
//         int index = 0;
//         for(int i=0; i<zeros; i++){
//             nums[index++] = 0;
//         }
//         for(int i=0; i<ones; i++){
//             nums[index++] = 1;
//         }
//         for(int i=0; i<twos; i++){
//             nums[index++] = 2;
//         }