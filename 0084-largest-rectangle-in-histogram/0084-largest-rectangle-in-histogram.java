class Solution {
    
    static int[] nextSmaller(int arr[], int n) {
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while(!st.empty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(!st.empty()){
                ans[i] = st.peek(); // index of next Smaller element 
            }
            else { // arr[i] doesn't have Next smaller element then we have top go all the way till n
                ans[i] = n; // MOST IMPORTANT
            }
            st.push(i);
        }
        return ans;
    }
    
    static int[] prevSmaller(int arr[], int n) {
        
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.empty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(!st.empty()){
                ans[i] = st.peek(); // index of next Smaller element
            }
            else { // arr[i] doesn't have previous smaller element then we have top go all the way till -1
                ans[i] = -1; // MOST IMPORTANT 
            }
            st.push(i);
        }
        return ans;
    }
    
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        int nexts[] = nextSmaller(heights, n);
        int prevs[] = prevSmaller(heights, n);
        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, (nexts[i] - prevs[i] - 1) * heights[i]);
        }
        return ans;
    }
}

/*
//samraat sir

        int area = 0;
        int n=heights.length;
        
        Stack<Integer> st = new Stack<>();
        
        st.push(-1);

        for(int i=0; i<n; i++){
            while(st.peek()!=-1 && heights[st.peek()]>=heights[i]){
                int h=heights[st.peek()];
                st.pop();

                int width = i - st.peek() - 1;
                area=Math.max(area, h*width);
            }
            st.push(i);
        }

        while(st.peek()!=-1){
            int h=heights[st.peek()];
            st.pop();

            int w=n-st.peek()-1;
            area=Math.max(area, h*w);
        }

        return area;

*/