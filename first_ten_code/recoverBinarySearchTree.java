class Solution {
    TreeNode first,second,pre;

    void work(TreeNode root){
        if(root==null)return;
        work(root.left);

        if(pre!=null && root.val<pre.val){
            if(first==null){
                first=pre;
                second=root;
            }else{
                second=root;
            }
            
        }
        pre=root;
        work(root.right);
    }
    public void recoverTree(TreeNode root) {
        first=null;
        second=null;
        pre=null;
        work(root);
        int x=first.val;
        first.val=second.val;
        second.val=x;
        
       
    }
}
