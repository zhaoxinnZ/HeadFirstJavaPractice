package pers.xinn.LeetCode.AddTwoNumbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode sol = new ListNode(0);
        ListNode prev = sol;

        while (l1 != null || l2 != null || carry != 0) {
            ListNode current = new ListNode(0);

            int sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0) + carry;

            current.val = sum % 10;
            carry = sum / 10;
            prev.next = current;
            prev = current;

            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next : l2;

        }
        return sol.next;
    }
}
