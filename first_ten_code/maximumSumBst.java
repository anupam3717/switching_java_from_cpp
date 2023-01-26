class Solution {
    int ans=0;
     class Help{
        int maxi;
        int mini;
        int sum;
        boolean isBst;
        Help(){
            sum=0;
            maxi=Integer.MIN_VALUE;
            mini=Integer.MAX_VALUE;
            isBst=false;
        }
    }
    
    Help work(TreeNode root){
        if(root==null){
           Help a=new Help();
           a.isBst=true;
           return a; 
        }
        Help l=work(root.left);
        Help r=work(root.right);
        Help cur=new Help();
        if(l.isBst && r.isBst && l.maxi<root.val && r.mini>root.val){
            cur.isBst=true;
            cur.maxi=Math.max(root.val,r.maxi);
            cur.mini=Math.min(root.val,l.mini);
            cur.sum=root.val+l.sum+r.sum;
            ans=Math.max(ans,cur.sum);
            return cur;
        }
        return cur;
    }
    public int maxSumBST(TreeNode root) {
        work(root);
       return ans;
    }
}
