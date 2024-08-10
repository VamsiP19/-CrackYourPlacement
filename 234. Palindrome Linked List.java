class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode save = head;

        while(save != null){
            st.push(save.val);
            save = save.next;
        }
        save = head;
        while(save != null){
            if(save.val != st.pop()){
                return false;
            }
            save = save.next;
        }
        return true;
    }
}
