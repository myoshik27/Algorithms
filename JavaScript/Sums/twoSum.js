// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that nums is an array of integers
// You may assume that target is an integer
// You may assume that each input would have exactly one solution.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var answer = [];
    var dictionary = {};
    for(var i=0; i<nums.length; i++){
        if(dictionary[nums[i]] !== undefined){
            answer[0] = dictionary[nums[i]];
            answer[1] = i;
            return answer;
        }
        dictionary[target-nums[i]] = i;
    }
    return answer;
};


// Tested on https://leetcode.com/problems/two-sum/
// O(n) runtime, O(n) space
