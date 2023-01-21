class Solution {
    public String decodeString(String s) {
    Stack<String> stack = new Stack<>();
       for (Character c: s.toCharArray()){
           if(c!=']'){
		        stack.push(String.valueOf(c));
           } else {
               StringBuilder sb = new StringBuilder();
               while (!stack.isEmpty() && !stack.peek().equals("[")){
                   sb.insert(0, stack.pop());
               }
               String str = sb.toString();
               sb.setLength(0);
               stack.pop();

               while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
                   sb.insert(0, stack.pop());
               }
               int num = Integer.parseInt(sb.toString());
               for (int i=0; i<num; i++){
                   stack.push(str);
               }
           }
       }
       String ans = String.join("", stack);
       return ans;
    }
}