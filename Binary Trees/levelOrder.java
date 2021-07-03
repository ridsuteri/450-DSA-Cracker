import java.util.*;
/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class levelOrder
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(node == null){
         return ans;   
        }
        
        q.add(node);
        ans.add(node.data);
        
        while(!q.isEmpty()){
            
            Node front = q.poll();
            if(front.left != null){
                q.add(front.left);
                ans.add(front.left.data);
            }
            
            if(front.right != null){
                q.add(front.right);
                ans.add(front.right.data);
            }
                
        }
        
        return ans;
    }
}
