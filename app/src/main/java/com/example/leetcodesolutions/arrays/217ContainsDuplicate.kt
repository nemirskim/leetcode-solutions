package com.example.leetcodesolutions.arrays

class `217ContainsDuplicate` {
    /* Given an integer array {nums}, return true if any value appears at least twice in the array,
    and return false if every element is distinct.
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        var set: MutableSet<Int> = mutableSetOf()
        for(num in nums){
            if (!set.add(num)){
                return true
            }
        }
        return false
    }
}