/*
Problem: Valid Anagram
Pattern: Frequency Counting Pattern
Input Structure: Array

Brute Force
Time: O(n²)
Space: O(1)

HashMap Approach
Time: O(n)
Space: O(n)
*/


class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) { // if the length of the two strings are unequal, they cannot be anagrams of each other, hence we exit early
            return false;
        }

        boolean [] used = new boolean[t.length()]; // initializing an array "used" containing boolean values for the characters of string t. It is initialized a [false, false, false, false, false, false] initially--> indicating that no characters of the string t has been matched yet with the characters of string s. 
        for (int i = 0; i < s.length(); i++) { // initializing the loop to look thorough all the characters in string s
            boolean foundMatched = false; // initializing a boolean "foundMatched" as false, which indicates that no matching characters have been found yet for stinf s and t
            for (int j = 0; j < t.length(); j++) { // initializing a nested loop to look thorough all the characters in string t
                if ((s.charAt(i) == t.charAt(j)) && (!used[j])) { // intitiating condition to check if the current character of string s matches the current character of string t, and if the current character of string t hasn't been used yet
                    foundMatched = true; // if the above condition is true, it means a matching character is found. Set it as true, indicating that a matching character has been found
                    used[j] = true; // set the current index of string t as true, which indicates that the matching character was found at this index. This will ensure that if there are repeating characters in a string, it will not be reused (since we are keeping track of the already found characters with the help of their respective indices)
                    break; // break the loop once the matching character is found. The control now goes back to the outer loop
                }
            }
            if (!foundMatched) {
                return false;
            } // If the loop does not return all matching characters (within the loop), return the boolean as false, because it doesn't satisfy the conditions of an anagram.
        }
        return true; // return true if all the conditions are satisfied --> length of both strings are same, and both the strings have the same characters
    }
}



class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) { // this condition is checking if the length of both the strings are not the same, in which case, the strings are proven to be not anagrams of each other.
            return false;
        }

        int[] count = new int[26]; // initializing an int array of length 26 (index 0 - 25), all with default values 0; this will be used as a frequency array to keep a count of characters found in strings s and t

        for (int i = 0; i < s.length(); i++) { // looping through the first string to check the characters and frequencies
            int index = s.charAt(i) - 'a'; // initializing index which determines at which index in the frequency array should the current character be represented
            count[index]++; // increment the occurence of the current character in the frequency array by 1
        }

        for (int i = 0; i < t.length(); i++) { // looping through the second string to check for characters and freqquencies
            int index = t.charAt(i) - 'a'; // initializing index which determines from which index in the frequency array should the current character be removed
            count[index]--; // decrement the occurence of the current character from the frequency table by 1

            if (count[index] < 0) { // if the index count is calculated to be below 0 (or -1), it means that the number of characters in the two strings are mismatched; hence they are not anagrams of each other
                return false;
            }
        }
        return true; // return true if the length was equal, there were no negative counts, therefore all counts must be zero
    }
}