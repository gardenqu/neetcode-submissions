class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // 1. Find the smallest word
        String prefix = strs[0];
        for (String s : strs) {
            if (s.length() < prefix.length()) {
                prefix = s;
            }
        }

        // 2. Check the prefix against every word
        for (int i = 0; i < strs.length; i++) {
            // While the current word doesn't START with the prefix
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If it becomes empty, there is no common prefix
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}