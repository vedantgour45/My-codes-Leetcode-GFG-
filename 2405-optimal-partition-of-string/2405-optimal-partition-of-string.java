class Solution {
    public int partitionString(String s) {
        
        //pos[] to keep track of the most recent position of each letter in the input string.
        int[] pos = new int[26];
        
        int res = 0;
        //last represents the last index of the current substring being processed.
        int last = 0;
        
        for (int i=0; i<s.length(); i++) {
            //If the value is greater than or equal to the current value of "last", then the current character must be included in the next substring. 
            if (pos[s.charAt(i)-'a'] >= last) {
                res++; //to indicate that a new substring has been found,
                last = i+1;  //sets the value of "last" to the index of the next character after the current character.
            }
            
            pos[s.charAt(i)-'a'] = i+1;
        }
        return res;
    }
}