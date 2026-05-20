class Solution {

    public int[] sortArray(int[] nums) {
        
        mergeSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSortHelper(int[] arr, int start, int end) {
        //If the segment has 1 or 0 elements, it's already sorted
        if (start >= end) {
            return;
        }

        // Use integer division to find the midpoint 
        int mid = (start + end) / 2;

        // Recursive calls
        mergeSortHelper(arr, start, mid);       // Sort left half
        mergeSortHelper(arr, mid + 1, end);   // Sort right half

        // Merge the two sorted halves back together
        merge(arr, start, mid, end);
    }

    private void merge(int[] arr, int start, int mid, int end) {
        // Create temporary arrays for left and right 
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];

        // Copy data to temp arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Step 3: Merge them back into arr[] in sorted order
        int i = 0, j = 0, k = start;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}