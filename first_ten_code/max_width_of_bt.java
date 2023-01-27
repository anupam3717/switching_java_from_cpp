class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<Integer,TreeNode>>q=new LinkedList();
        Pair<Integer,TreeNode> p1=new Pair(1,root);
        q.add(p1);
        int ans=0;
        while(q.isEmpty()==false){
            int n=q.size();
            Pair<Integer,TreeNode> fast=q.peek();
            int s=2*q.peek().getKey()-1;
             Pair<Integer,TreeNode> temp=null;
            while(n>0){
                n--;
                temp=q.remove();
                
                if(temp.getValue().left!=null)q.add(new Pair<Integer,TreeNode>(2*temp.getKey()-s,temp.getValue().left));
                if(temp.getValue().right!=null)q.add(new Pair<Integer,TreeNode>(2*temp.getKey()-s+1,temp.getValue().right));
            }
            ans=Math.max(ans,temp.getKey()-fast.getKey()+1);
        }
        return ans;
    }
}