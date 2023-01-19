class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>(); //char -> index
        int max = 0;
        int mostFreqCount = 0;
        int i = 0, j = 0;
        int n = s.length();
        while(j < n) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            mostFreqCount = Math.max(mostFreqCount, map.get(c));
            int numOfOtherCharacters = (j - i + 1) - mostFreqCount;
            //i don't need to know which chars. 
            //keep track of total chars that were replaced max

            if(numOfOtherCharacters > k) {
                char charAti = s.charAt(i);
                i++;
                map.put(charAti, map.get(charAti) - 1);
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}