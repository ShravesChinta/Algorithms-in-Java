/***
 Maximum Subarray
 
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

Here we give maxSum to Integer.MIN_VALUE to handle the negative values. it can be that the array contains all the negative values. so in case of negative elements 
only the least negative value is the max one. Here whenever the a subarray fetches us a value of 0 or negative, we ignore it replace that value by 0. any negative value will decrease the value of a positive number. so 
there is no need of adding the negative value.
***/

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            currentSum=currentSum+nums[i];
            
            maxSum=Math.max(currentSum,maxSum);
            
            if(currentSum <=0){     
                currentSum=0;
            }
            
            }
        return maxSum;
    }
}
