# First Come First Serve
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">CodeMart is a&nbsp;shopping platform and it is distributing gift vouchers to its esteemed users. The voucher can be redeemed by providing a fixed amount of shopping credits to the platform. One credit is sent by a user to the platform&nbsp;by doing one occurance in CodeMart. Since there is a huge rush of people you are required to manage the users on the basis of first come first serve. The user which came&nbsp;first and has <strong>exactly&nbsp;k</strong> occurrences at last is given the voucher first. You are given an array <strong>arr[ ] </strong>with the id's of <strong>N</strong>&nbsp;users in chronological order of their occurances&nbsp;. You are required to print the id of the user which will be given the voucher first. If no such user meets the condition print "-1".</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 7 
K = 2
arr[] = {1, 7, 4, 3, 4, 8, 7} 
<strong>Output:</strong> 7
<strong>Explanation</strong>: Both 7&nbsp;and 4 occur 2 times.
But&nbsp;<strong>7</strong>&nbsp;is the first that occurs 2 times.  </span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 6 
K = 1 
arr[] = {4, 1, 6, 1, 6, 4} 
<strong>Output:</strong> -1 
<strong>Explanation</strong>: No one occurs exactly 1 time.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>firstElement</strong>() that takes <strong>array arr, integer&nbsp;n&nbsp;and integer k </strong>as input parameters and returns&nbsp;the required answer.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N).<br>
<strong>Expected Auxiliary Space: </strong>O(max(arr[i])).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>4</sup><br>
1 ≤ arr[i]&nbsp;≤ 10<sup>3</sup></span></p>
</div>