class Solution {
    public boolean isPalindrome(String s) {
        // String str = s.replaceAll("[^a-zA-Z0-9]","");
        // str = str.toLowerCase();
        // String rev = "";
        // for(int i=str.length()-1; i>=0; i--){
        //     rev = rev+str.charAt(i);
        // }
        // if(rev.equals(str)==true){
        //     return true;
        // }
        // return false;
        
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') ||
               (s.charAt(i)>='A' && s.charAt(i)<='Z') || 
              (s.charAt(i)>='0' && s.charAt(i)<='9')){
                ans = ans + s.charAt(i);
            }
        }
        ans = ans.toLowerCase();
        String rev = "";
        for(int i=ans.length()-1; i>=0; i--){
            rev = rev+ans.charAt(i);
        }
        if(rev.equals(ans)){
            return true;
        }
        return false;
    }
}