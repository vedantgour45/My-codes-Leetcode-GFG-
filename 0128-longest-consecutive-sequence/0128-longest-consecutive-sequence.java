class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        int max = 1;

        if(n==1) 
            return 1;

        if(n==0) 
            return 0;

        for(int i=0;i<n-1;i++) {            
            if(arr[i]==arr[i+1]-1) {
                count++;
                max=Math.max(max,count);
            } else if(arr[i]==arr[i+1]) {
                continue;
            }
            else {
                count=1;
            }
        }
        return max;
    }
}

/*
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
*/