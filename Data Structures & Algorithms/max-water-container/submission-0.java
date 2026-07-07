

class Solution {
    public int maxArea(int[] heights) {
        int anchor = 0; 
        int scan = heights.length - 1;
        int max_h = 0;

       
        while (anchor < scan) {
            
            // 1. Calculate the current area BEFORE moving the pointers
            int currentArea = Math.min(heights[anchor], heights[scan]) * (scan - anchor);
            
            // 2. Update the maximum area found so far
            max_h = Math.max(max_h, currentArea);

            // 3. Move the pointer pointing to the shorter bar inward
            if (heights[anchor] <= heights[scan]) {
                anchor++;
            } else {
                scan--;
            }
        } 

        return max_h;
    }
}