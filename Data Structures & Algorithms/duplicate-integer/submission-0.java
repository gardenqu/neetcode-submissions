class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> hold = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            
            if(!hold.containsKey(nums[i])){
                hold.put(nums[i],1);
            }else{
                return true;
            }



        }

        return false; 
 
    }
}
