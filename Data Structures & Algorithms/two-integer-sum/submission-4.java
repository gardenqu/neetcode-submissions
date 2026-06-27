class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hold= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int ans_from_sub=target-nums[i];

            if(hold.containsKey(ans_from_sub) ){
                return new int[]{hold.get(ans_from_sub),i};
            }

            hold.put(nums[i],i); 


        }
        return new int[]{};
        
    }
}
