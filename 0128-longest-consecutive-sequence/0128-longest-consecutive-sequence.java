class Solution {
    public int longestConsecutive(int[] arr) {
        
        Map<Integer, Boolean> hm = new HashMap<>();
        
        for(int val : arr) {
            hm.put(val, true);
        }
        
         for(int val : arr) {
           if(hm.containsKey(val-1)) {
               hm.put(val, false);
           }
        }
        
        int maxLength = 0;
        for(int val : arr) {
            if(hm.get(val)==true) {
                int tempLength = 1;
                int tempLengthStartPoint = val;

                while(hm.containsKey(tempLengthStartPoint + tempLength)) {
                    tempLength++;
                }

                if(tempLength>maxLength) {
                    maxLength = tempLength;
                }
            }
        }
        return maxLength;
    }
}