class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode save = head;

        while(save != null){
            st.push(save.val);
            save = save.next;
        }
        save = head;
        while(save != null){
            save.val = st.pop();
            save = save.next;
        }
        return head;
    }
}
