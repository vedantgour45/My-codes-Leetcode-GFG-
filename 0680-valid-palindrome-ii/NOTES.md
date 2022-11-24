https://leetcode.com/problems/valid-palindrome-ii/discuss/1904942/JavaC%2B%2B-Awesome-Visuall-EXPLANATION 

Let's consider on example in order to understand it :-
Input: s = "abcdecba"
Output: true

So, what I can do is create two pointer's & start comparing them from.

One will start from 0th Index & another will start from last index.
We'll check, if they are equal then continue checking
But if they are undequal we can have 2 cases :-
Case 1 : Skip e to check whether it's forming an palindrome
Case 2 : Skip d to check whether it's forming an plaindrome
But still if after deleting one character we are not gettong palindrome return false
Otherwise return true
