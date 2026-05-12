class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> hold= new HashSet<>();

        /*for(int i=0; i<nums.length; i++){
            
            if(hold.contains(nums[i])){
                return true;
            }else{

                hold.add(nums[i]);
            }

        }*/

        for(Integer i: nums){

            if(hold.contains(i)){
                return true;
            }else{
                hold.add(i);
            }
            
        }
        return false;

        
    }
}