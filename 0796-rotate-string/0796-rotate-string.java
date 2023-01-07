class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String combine = s + s;
        return combine.contains(goal);
    }
}