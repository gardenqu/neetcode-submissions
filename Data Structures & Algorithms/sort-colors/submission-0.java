class Solution {
    public void sortColors(int[] nums) {

        // given an array and need to sort it in place 
        // method- use 3 pointser to keep track of low ,mid, and high

        int low=0,mid=0; 
        int high=nums.length-1;

        while(mid<=high){


            if(nums[mid]==2){
                // swap with high
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp; 
                high--;

            }else if(nums[mid]==0){

                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp; 
                low++;
                mid++;

            }else if(nums[mid]==1){
                mid++; 

            }

        }


        
    }
}