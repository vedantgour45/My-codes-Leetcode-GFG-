class Solution {
    public int maxProduct(int[] arr) {
        if (arr.length == 0) return 0;
		
        int max = arr[0];
		int min = arr[0];
		int result = arr[0];
		
        for (int i=1; i<arr.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr[i], min * arr[i]), arr[i]);
            min = Math.min(Math.min(temp * arr[i], min * arr[i]), arr[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
}