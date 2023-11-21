/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
//     let ans = [];
//     for(let i=0; i<nums.length-1; i++) {
//         for(let j=i+1; j<nums.length; j++) {
//             if(nums[i]+nums[j]===target) {
//                 ans[0] = i;
//                 ans[1] = j;
//             }
//         }
//     }
    
//     return ans;
    
    const map = new Map();
    for(let i=0; i<nums.length; i++) {
        const element = target-nums[i];
        if(map.has(element)) {
            return [map.get(element), i]
        }
        map.set(nums[i], i)
    }
    return [];
};