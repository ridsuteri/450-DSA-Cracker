class findValue{
    public boolean find(Node root, int n) {
        if (root == null) {
            return false;
        }

        boolean ans = false;
        ;
        if (n > root.data) {
            ans = find(root.right, n);
        } else if (n < root.data) {
            ans = find(root.left, n);
        } else {
            return true;
        }

        return ans;

    }
}