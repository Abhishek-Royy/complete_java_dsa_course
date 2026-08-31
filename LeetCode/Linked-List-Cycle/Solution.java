1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode slow=head;
15        ListNode fast=head;
16
17        while(fast!=null){
18            fast=fast.next;
19            if(fast!=null){
20                fast=fast.next;
21                slow=slow.next;
22            }
23
24            // matching
25            if(fast==slow){
26                return true;
27            }
28        }
29        return false;
30    }
31}