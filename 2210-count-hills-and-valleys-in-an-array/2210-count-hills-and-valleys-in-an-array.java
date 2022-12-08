class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        
        // 1)----> to store the count of hills & valleys
        int count = 0;
        
        // 2)----> save the first element
        int prev = nums[0];
        
        // 3)----> start the loop from 1 as we have already saved 0'th element
        for(int i = 1; i < nums.length-1; i++){
            // 4)----> count the numbers of hills & valleys 
            if((nums[i] > nums[i+1] && nums[i] > prev || (nums[i] < nums[i+1] && nums[i] < prev)))
                count++;
            // 5)----> update the prev only if the elements are not same
            if(nums[i] != nums[i+1]){
                prev = nums[i];
            }
        }
        // 6)----> return ans
        return count;
    }
}
// 1)----> Create a count variable to store the count of hills & valleys
// 2)----> Create a prev variable to save the first element
// 3)----> Start the loop from 1 as we have already saved 0'th element
/* 4)----> Count the numbers of hills & valleys 
           1st condition ---> nums[i] > nums[i+1] && nums[i] > prev
                this means that i is greater than both its adjecent elements i.e it is a hill so do a count++
           2nd condition ---> nums[i] < nums[i+1] && nums[i] < prev
                this means that i is smaller than both its adjecent elements i.e it is a valley so do a count++*/
// 5)----> Keep updating the prev only if the elements are not same
// 6)----> At last return the count of hills & valleys