/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int tSum = list.get(l) + list.get(r);
            if (max < tSum) {
                max = tSum;
            }
            l++;
            r--;
        }
        return max;
    }
}
