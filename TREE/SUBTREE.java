class Solution {
    private boolean vis(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }else if(root==null || subRoot==null){
            return false;
        }
        if(root.val!=subRoot.val){
            return false;
        }
        return vis(root.left,subRoot.left) && vis(root.right,subRoot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(vis(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
