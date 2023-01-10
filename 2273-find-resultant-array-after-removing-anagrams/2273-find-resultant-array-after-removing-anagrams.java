class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        String originalString = "";
        
        List<String> ans = new ArrayList<>();
        
        for(int i=0; i<words.length; i++) {
            
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            String newString = String.valueOf(ch);
            
            if(!newString.equals(originalString)){
                ans.add(words[i]);
                originalString = newString;
            }
        }
        
        return ans;
    }
}