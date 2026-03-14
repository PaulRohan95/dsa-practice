// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] {i, j};
//                 }
//             }
//         }
//         throw new IllegalArgumentException("No solution");
//     }
// }

import java.util.HashMap;

public class TwoSum {
    HashMap<Integer, Integer> map = new HashMap<>(); //initiating a new hashmap to store the elements and their indices
    public int[] twoSum(int[] nums, int target) {
		
        for (int i = 0; i < nums.length; i++){ // initiating a for loop from the first index to the last index in the array
            int neededNum = target - nums[i]; // initializing neededNum as the number needed to be added with the current element in the loop to reach the target
            if (map.containsKey(neededNum)) { // checking if the hashmap contains the required number to reach the target
                return new int [] {map.get(neededNum), i}; // if the hashmap contains the required number needed to reach the target, return the array containing the index of the required number, and the index of the current number
            }
            map.put(nums[i], i); // if the hashmap doesn't contain the required number, we store the current number in the hashmap, along with its index
        }
        throw new IllegalArgumentException("No solution"); // if no two such indices are found, return the exception
    }
}

