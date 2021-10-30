class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return new ArrayList<>();
        }
 
        q.add(root);
 
        while (!q.isEmpty()) {
            int n = q.size();
 
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.peek();
                q.remove();
 
                if (i == n - 1) {
                    res.add(curr.val);
                }
 
                if (curr.left != null) {
                    q.add(curr.left);
                }
                
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return res;
    }
}
