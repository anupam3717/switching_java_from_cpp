class Solution {
    int n;
    int ans;

    void work(TreeNode root){
        if(root==null)return;
        work(root.left);
        n--;
        if(n==0){
            ans=root.val;
            return;
        }
        work(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        n=k;
        
        ans=0;
        work(root);
        return ans;
    }
}
