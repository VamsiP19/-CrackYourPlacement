class Solution {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return rec(pre,0,pre.length-1, post,0,post.length-1);
    }
    
    public TreeNode rec(int[] pre,int i, int j, int[] post,int m, int n) {
        if(i==j){
             return new TreeNode(pre[i]);
        }
        TreeNode node = new TreeNode(pre[i]);
        if(i<j){
            int leftNode=pre[i+1];
            int end=0;
            for(int p=m;p<n;p++){
                if(post[p]==leftNode){
                    end=p;
                    break;
                }
            }
            int size=end-m+1;
            if(i+1<=i+size){
                 node.left=rec(pre,i+1,i+size, post,m,end);
            }
           if(i+size<=j && end+1<=n-1){
               node.right=rec(pre,i+size+1,j, post,end+1,n-1);
           }
            
        }
        return node;
    }
}
