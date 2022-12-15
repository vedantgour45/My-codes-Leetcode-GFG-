class Solution {
    public int firstUniqChar(String s) {
        
        //create HashMap
        HashMap<Character, Integer> hm = new HashMap<>();
        
        //count freq of characters
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1); //add 1 to curr freq of char or else add 1 to default freq;
        }
        
        for(int i=0; i<s.length(); i++) {
            if(hm.get(s.charAt(i))==1) {
                return i;
            }
        }
        return -1;
    }
}