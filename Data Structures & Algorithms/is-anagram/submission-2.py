class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        hold={}

        if len(s)!=len(t):
            return False

        for i in s:
            hold[i] = hold.get(i, 0) + 1

        for x in t:

            if x not in hold:
                return False

            if hold[x]==0:
                return False
            else:
                hold[x]=hold.get(x, 0) - 1
            
        return True 

        