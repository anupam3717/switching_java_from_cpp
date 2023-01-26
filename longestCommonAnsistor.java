class Solution {
    TreeNode work(TreeNode root, TreeNode p, TreeNode q){
         if(root==null)return null;
         if(root==p || root==q)return root;
         TreeNode l=work(root.left,p,q);
         TreeNode r=work(root.right,p,q);
         if(l==null && r==null)return null;
         if(l!=null && r!=null)return root;
         if(l!=null)return l;
         return r;
     }
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         return work(root,p,q);
     }
 }
