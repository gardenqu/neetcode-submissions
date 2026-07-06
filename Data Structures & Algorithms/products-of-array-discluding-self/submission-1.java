class Solution {
    public int[] productExceptSelf(int[] nums) {


        
        int[] result=new int[nums.length];

        for(int a=0; a<nums.length;a++){
            int ans=1;

            for(int b=0; b<nums.length;b++){

                if(a==b) continue;

                ans*=nums[b]; 

            }
            result[a]=ans;
            
        
        }

        return result;
        
    }
}  
