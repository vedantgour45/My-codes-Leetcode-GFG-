![image]([https://user-images.githubusercontent.com/113295244/203697800-978e925f-7e9c-4be9-9027-450a4e7f39e4.png](https://assets.leetcode.com/users/images/620dc518-3c9f-4d32-8cac-71eb6ee91216_1648864228.2340546.gif))

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
