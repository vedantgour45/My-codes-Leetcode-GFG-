class Solution {
    public int minKBitFlips(int[] A, int K) { 
        // use an count to check how many times current element has been fliped
        int out = 0, count=0;
        // use an boolean array to track till what array element you will flip
        boolean[] checkFlip = new boolean[A.length];
        for(int i=0; i<A.length; i++){
            // You need to flip only if A[i] == 0 and you haven’t fliped it or all the flips have been Canceled due even number of flips
            // You will also need to flip if you have fliped A[i]==1 odd number of times.
            if( (A[i]==0 && count%2==0) || (A[i]==1 && count%2!=0)){
                count++;
                out++;
                if(i+K-1>=A.length){
                    // You will return -1 as you encountered an element which needs flip but there aren't enough elements to flip ahead and all the previous elements are 1.
                    return -1;
                }else{
                    // If you flip a current elements use checkFlip to keep track till which element current flip has effect.
                    checkFlip[i+K-1] = true;
                }
            }
            if(checkFlip[i]){
                // Decrement the count as you are passing a element till which certain flip was active
                count--;
            }
        }
        return out;
    }
}

// class Solution {
    
//      private void flip(int[] nums,  int start, int k) {
//         for(int i = start; i < (start+k); i++) {
//             if (nums[i] == 0) {
//                 nums[i] = 1;
//             } else {
//                 nums[i] = 0;
//             }
//         }    
//     }
    
//     public int minKBitFlips(int[] nums, int k) { // O(n^2)
        
//         int count = 0;
//         int n = nums.length;
        
//         for(int i=0; i<n; i++) {
//             if(nums[i] == 0 && (i+k-1) < n) {  //if flipping k consecutive elements starting from the current index i is within the bounds of the array. 
//                 count++;
//                 flip(nums, i, k);
//             }
//         }
        
//         for(int i : nums)
//             if(i == 0) return -1;
        
//         return count;
//     }
// }

/* Brute force --> O(n^2)

int n = nums.length;
int index;
int count = 0;

for (int i=0; i<n; i++) {
    if (nums[i] == 0) {
        index = i;
        while (index < i+k) {
            if (index < nums.length) {
                nums[index] ^= 1;
            }
            index++;
        }

        if (index > nums.length) {
            return -1;
        }

        count++;
    }
}
return count;

*/