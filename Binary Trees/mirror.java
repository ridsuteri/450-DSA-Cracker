class Solution {
    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        
//         for null case
        if(root1 == null && root2 == null)
            return true;
        
//         left to right and right to left
        if(root1 != null && root2 != null && root1.val == root2.val){
            return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right,     root2.left);
        }
        
        else
            return false;
            
    }
    
    public boolean isSymmetric(TreeNode root){
        return isSymmetric(root, root);
    }
}
