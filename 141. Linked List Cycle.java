class Solution {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        len = len/2;
        for(int i = 0;i <len;i++){
            head = head.next;
        }
        return head;
    }
}
