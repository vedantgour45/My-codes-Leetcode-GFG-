class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        int max = 1;

        if(n==1) 
            return 1;

        if(n==0) 
            return 0;

        for(int i=0;i<n-1;i++) {            
            if(arr[i]==arr[i+1]-1) {
                count++;
                max=Math.max(max,count);
            } else if(arr[i]==arr[i+1]) {
                continue;
            }
            else {
                count=1;
            }
        }
        return max;
    }
}

/*
Arrays.sort(arr);
int count = 1;
int max = 1;

if(n==1) 
    return 1;

if(n==0) 
    return 0;

for(int i=0;i<n-1;i++) {            
    if(nums[i]==nums[i+1]-1) {
        count++;
        max=Math.max(max,count);
    } else if(nums[i]==nums[i+1]) {
        continue;
    }
    else {
        count=1;
    }
}
return max;
*/