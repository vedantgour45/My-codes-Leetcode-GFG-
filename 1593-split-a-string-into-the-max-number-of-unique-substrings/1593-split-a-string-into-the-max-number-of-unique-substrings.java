class Solution {
    
    public int maxUniqueSplit(String s) {
        return dfs(s, new HashSet<>(), 0);
    }
    
    public int dfs(String s, Set<String> set, int cur) {
        
        if (cur == s.length()) {
            return set.size();
        }

        int max = 0;
        
        for (int i = cur; i < s.length(); i++) {
            
            String word = s.substring(cur, i+1);
            
            if (!set.contains(word)) {
                set.add(word);
                max = Math.max(max, dfs(s, set, i+1));
                set.remove(word);
            }
        }
        
        return max;
    }
}