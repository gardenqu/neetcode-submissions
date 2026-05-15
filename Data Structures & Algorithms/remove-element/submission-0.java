/*
understand: I am given an array of integers and an integer val 
and I have to remove all occurrences of val from the list IN_PLACE
- order does does not matter 
match: two pointer: anchor and scanner
approach: 
- start with returning null if the list is empty
- anchor is the first element 
- scanner is the last element
- while the anchor is 3 and the scanner is not 3 we want to swap them
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0; 
        }

        int anc = 0; 
        int scan = nums.length - 1; // Start at the last index

        while (anc <= scan) {
            
            // 1. Move scan backward if it is pointing at the 'val' we want to remove
            // We can't use this element to replace anything, so just skip it.
            while (scan >= 0 && nums[scan] == val) {
                scan--;
            }

            // 2. Check if pointers crossed after moving scan
            if (anc > scan) break;

            // 3. If anc is pointing at a 'val', swap it with the 'good' element at scan
            if (nums[anc] == val) {
                nums[anc] = nums[scan];
                scan--; // That 'good' element is now moved, so shrink the window
            }
            
            // 4. Move anchor forward
            anc++;
        }

        return anc; 
    }
}