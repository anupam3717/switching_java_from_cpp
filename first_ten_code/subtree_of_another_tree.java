class Solution {
    boolean work(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;
        if(t1==null || t2==null)return false;
        if(t1.val!=t2.val)return false;
        if(work(t1.left,t2.left)==false || work(t1.right,t2.right)==false)return false;
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)return false;
        
        if(isSubtree(root.left,subRoot)==true ||
        isSubtree(root.right,subRoot)==true)return true;
        if(root.val==subRoot.val){
            System.out.println("hi");
            return work(root,subRoot);}
        return false;
    }
}
