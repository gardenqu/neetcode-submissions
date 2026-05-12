class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        hold={}

        for i,num in enumerate(nums):
            comp= (target-num)

            if comp in hold:
                return [hold[comp], i]
            hold[num] = i



        
        