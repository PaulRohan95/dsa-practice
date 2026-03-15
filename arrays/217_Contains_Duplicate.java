/*
Problem: Contains Duplicate
Pattern: Hashing
Input Structure: Array

Brute Force
Time: O(n²)
Space: O(1)

HashSet Approach
Time: O(n)
Space: O(n)
*/


// class Solution {
//     public boolean containsDuplicate(int[], num) {
//         for (int i = 0; i < nums. length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

import java.util.HashSet; // importing HashSet from java --> util

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // Initializing a new HashSet to store the elements
        for (int i = 0; i < nums.length; i++) { // Starting a loop to store and check the presence of elements in the hashset
            if (set.contains(nums[i])) { // if the hashset already contains the current number, return true
                return true;
            }
            set.add(nums[i]); // if the current number does not exist in the hashset yet, add the number in the set
        }
        return false; // return false if no numbers match any previously stored numbers in the hashset (i.e., there are no duplicate numbers in the array)
    }
}