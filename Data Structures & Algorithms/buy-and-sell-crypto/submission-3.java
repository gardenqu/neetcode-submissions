class Solution {
    public int maxProfit(int[] prices) {


        int left=0; 
        int sum=0;

        for(int right=1; right<prices.length; right++){

            if(prices[right]<prices[left]){
                left=right;

            }else{

                sum= Math.max(sum,prices[right]-prices[left]);



            }

            
        }

         return sum;
        
    }
}
