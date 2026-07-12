class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
         # Input: array of strings
         # return longest common prefix 
         # Method: Start with the shortest word and "remove" the element by decrementing the pointer postion


        small_word=min(strs,key=len)
        sp=len(small_word)

        for word in strs:

            if small_word==word:
                continue 
            while sp >0:
                if word.startswith(small_word[:sp]):
                    break
                sp-=1
                
            if sp<0:
                return ""
            

        return small_word[:sp]
