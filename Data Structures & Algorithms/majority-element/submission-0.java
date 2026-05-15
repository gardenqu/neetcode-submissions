class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> count= new HashMap<>(); 

        for(int i: nums){

            count.put(i,count.getOrDefault(i,0)+1);
        }

        int max_val= Collections.max(count.values());

        for(int x: count.keySet()){

            if(count.get(x)==max_val){
                return x; 
            }
        }

        return 0;

        
        
    }
}