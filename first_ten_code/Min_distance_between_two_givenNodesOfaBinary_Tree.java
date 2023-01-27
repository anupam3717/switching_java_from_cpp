lass GfG {
    Node work(Node root,int p,int q){
        if(root==null)return null;
        if(root.data==p || root.data==q)return root;
        Node l=work(root.left,p,q);
        Node r=work(root.right,p,q);
        if(l==null && r==null)return null;
        if(l!=null && r!=null)return root;
        if(l!=null)return l;
        return r;
    }
    int dis(Node root,int p){
        if(root==null)return 0;
        if(root.data==p)return 1;
        int l=dis(root.left,p);
        int r=dis(root.right,p);
        if(l!=0)return l+1;
       else if(r!=0)return r+1;
        return 0;
    }
    int findDist(Node root, int a, int b) {
       Node lca=work(root,a,b);
       int l=dis(lca,a);
        int r=dis(lca,b);
        return l+r-2;
    }
}
