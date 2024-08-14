class Solution {
    private int check(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=check(root.left);
        int r=check(root.right);
        return 1+Math.max(l,r);
    }
    public int maxDepth(TreeNode root) {
        int depth=check(root);
        return depth;
    }
}
