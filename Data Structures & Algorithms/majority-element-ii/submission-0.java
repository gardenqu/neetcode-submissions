class Solution {
    public List<Integer> majorityElement(int[] nums) {


        int count1=0, count2=0;
        int cand1=0, cand2=0; 

        if(nums==null|| nums.length==0){
            return new ArrayList<Integer>(); 
        }

        List<Integer> list= new ArrayList<>(); 

        for(int num : nums){
            

        if(num==cand1){
            count1++;
        }else if(num==cand2){
            count2++; 
        }else if(count1==0){
            cand1=num;
            count1=1;
        }else if(count2==0){
            cand2=num;
            count2++; 
        }else{
            count1--;
            count2--; 
        }


        }

        count1=0;
        count2=0;

        for(int n: nums){

            if(n==cand1){
                count1++;
            }else if(n==cand2){
                count2++; 
            }
        }

        if(count1>(nums.length/3)){
            list.add(cand1);

        }

        if(count2>(nums.length/3)){
            list.add(cand2);

        }

        return list;


        
    }
}