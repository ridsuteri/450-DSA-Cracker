class diameter {
    public int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return diameter;
    }
    public int getHeight(TreeNode node) {
        if(node.left == null && node.right == null) {
            return 0;
        }
        else {
            int leftH = 0;
            int rightH = 0;
            int height = 0;
            int tmpDia = 0;
            
            if(node.left != null) {
                leftH = getHeight(node.left);
                tmpDia += leftH+1;
            }
            if(node.right != null) {
                rightH = getHeight(node.right);
                tmpDia += rightH+1;
            }
                
            height = Math.max(leftH, rightH) + 1;
            diameter = Math.max(diameter, tmpDia);
            return height;
        }
    }
}
