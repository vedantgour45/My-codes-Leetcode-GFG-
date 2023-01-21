class Solution {
    
    private Stack<Character> createStack(String str) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != '#') {
                st.push(ch);
            } else if(!st.empty()){
                st.pop();
            }
        }
        return st;
    }
    
    public boolean backspaceCompare(String s, String t) {
        return createStack(s).equals(createStack(t));
    }
}