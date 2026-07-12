class Solution:
    def longestCommonPrefix(self, strs: list[str]) -> str:
        if not strs:
            return ""

        # Start with the shortest word as the initial prefix
        prefix = min(strs, key=len)
        
        for word in strs:
            # Shrink the prefix until the current word starts with it
            while not word.startswith(prefix):
                prefix = prefix[:-1]
                
                # If it shrinks to nothing, we can stop early
                if not prefix:
                    return ""
                    
        return prefix