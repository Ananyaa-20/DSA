class CountTotalNodes {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = leftDepth(root);
        int right = rightDepth(root);
        if(left == right){
            return(1<<left)-1;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
        
     }
    private int leftDepth(TreeNode node){
        int count = 0;
        while(node!=null){
            count++;
            node = node.left;
        }
        return count;
    }
    private int rightDepth(TreeNode node){
        int count=0;
        while(node!=null){
            count++;
            node = node.right;
        }
        return count;
    }
}
