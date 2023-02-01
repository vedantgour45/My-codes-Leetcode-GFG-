class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if(!(str1+str2).equals(str2+str1)) return ""; // because they will not have GCD
        
        int gcd = getGCD(str1.length(), str2.length());
        
        return str1.substring(0, gcd);
    }

    public int getGCD(int a, int b) {
        
        if (b==0) return a;
        return getGCD(b,a%b);
        
//         while(a % b != 0){
//             int remainder = a % b;
//             a = b;
//             b = remainder;
//         }
        
//         int GCD = b;
//         return GCD;
    }
}