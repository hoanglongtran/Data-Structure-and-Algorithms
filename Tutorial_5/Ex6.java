package Tutorial_5;

public class Ex6 {
    public int longestLenIncSeq(BTNode root){
        if (root == null) return 0;
        else{
            int lenLeft = longestLenIncSeq(root.left);
            int lenRight = longestLenIncSeq(root.right);
            lenRight++;
            return lenLeft > lenRight ? lenLeft : lenRight;
        }

    }
    public boolean isBalanced(BTree tree){
        
    }
}
