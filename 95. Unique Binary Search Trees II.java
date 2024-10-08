class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n < 1){
            return new LinkedList<TreeNode>();
        }
        return generateSubtrees(1,n);
    }

    public List<TreeNode> generateSubtrees( int s, int e) {
        List<TreeNode> res = new LinkedList<TreeNode>();
        if (s > e) {
            res.add(null);
            return res;
        }
        for (int i = s; i <= e; ++i){
            List<TreeNode> leftSubtrees = generateSubtrees(s, i - 1);
            List<TreeNode> rightSubtrees = generateSubtrees(i+1, e);
            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }

}
