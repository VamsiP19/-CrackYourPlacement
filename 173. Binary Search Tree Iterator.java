class BSTIterator {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int index =0;
    public BSTIterator(TreeNode root) {
        inOrder(root);
    }
    
    public int next() {
        return list.get(index++);
    }
    
    public boolean hasNext() {
        if(index==list.size()){
            return false;
        }
        return true;
    }

    public void inOrder(TreeNode root){
        if(root!=null){
           if(root.left!=null){
            inOrder(root.left);
           }
           list.add(root.val);
           if(root.right!=null){
            inOrder(root.right);
           }
        }    
    }
}
