/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let ans = [];
    for(let i=0; i<nums.length-1; i++) {
        for(let j=i+1; j<nums.length; j++) {
            if(nums[i]+nums[j]===target) {
                ans[0] = i;
                ans[1] = j;
            }
        }
    }
    
    return ans;
};