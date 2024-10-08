class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ans;
    }

    List<Integer> ans = new ArrayList<>();
    
    public void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        ans.add(node.val);
        inorder(node.right);
    }
}
