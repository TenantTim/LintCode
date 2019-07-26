/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: the given linked list
     * @return: the array that store the values in reverse order 
     */
    public List<Integer> reverseStore(ListNode head) {
        List<Integer> result = new ArrayList<Integer>();
        if(head == null) {
            return result;
        }

        ListNode pivot = head;
        while (pivot != null) {
            result.add(pivot.val);
            pivot = pivot.next;
        }

        int size = result.size();
        for (int i = 0; i < size / 2; i++) {
            int current = result.get(i);
            result.set(i, result.get(size - i - 1));
            result.set(size - 1 - i, current);
        }

        return result;
    }
}