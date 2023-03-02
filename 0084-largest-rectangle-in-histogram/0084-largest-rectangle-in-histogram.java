class Solution {
    public int largestRectangleArea(int[] heights) {
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
    }
}