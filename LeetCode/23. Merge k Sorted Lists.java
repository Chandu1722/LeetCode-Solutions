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
    public ListNode mergeKLists(ListNode[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        while (list.length > 1) {
            List<ListNode> temp = new ArrayList<>();
            for (int i = 0; i < list.length; i += 2) {
                ListNode l1 = list[i];
                ListNode l2 = i + 1 < list.length ? list[i + 1] : null;
                temp.add(mergeList(l1, l2));
            }
            list = temp.toArray(new ListNode[0]);
        }
        return list[0];
    }

    public static ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode ans = node;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                node.next = l2;
                l2 = l2.next;
            } else {
                node.next = l1;
                l1 = l1.next;
            }
            node = node.next;
        }
        node.next = l1 != null ? l1 : l2;
        return ans.next;
    }
}
