class Solution {
    private int index=0;
    private TreeNode check(int[] preorder,int min,int max){
        if(index>=preorder.length || preorder[index]<min || preorder[index]>max){
            return null;
        }
        TreeNode root=new TreeNode(preorder[index++]);
        root.left=check(preorder,min,root.val);
        root.right=check(preorder,root.val,max);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode s1=check(preorder,-2,2000);
        return s1;
    }
}
