class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int n = arr.length;
		int count = 0;
		int idx = 0;
		int ans[] = new int[n];
		for(int i=0; i<n; i++) {
			int max = arr[i];
			count = 0;
			for(int j=0; j<n; j++) {
				if(arr[j]<max) {
					count++;
				}
			}
			ans[idx++] = count;
		}
		return ans;
    }
}