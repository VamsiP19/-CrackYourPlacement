class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode cur = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode temp1 = cur.next;
            cur.next = temp1.next;
            temp1.next = prev.next;
            prev.next = temp1;
        }

        return temp.next;       
    }
}   
