//Given the root node of a 
//binary search tree and two integers
//low and high, return the sum of values of all 
//nodes with a value in the inclusive range [low, high].
//Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
//Output: 32
//Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
public class RangeSumBST 
{
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        adder(root, low, high);
        return sum;
    }
    
    public void adder(TreeNode node, int low, int high) {
        if(node == null) return;
        
        if(node.val <= high && node.val >= low) {
            sum += node.val;
        }
            
        adder(node.left, low, high);
        adder(node.right, low, high);
    }
}
}
