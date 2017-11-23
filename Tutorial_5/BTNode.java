package Tutorial_5;

public class BTNode {
    BTNode parent, left, right; //‘parent’ is optional
    int data;
    public BTNode (int i) {
        parent = left = right = null;
        data = i;
    }
    BTNode root;
    int size; //should be updated accurately
    public BTNode() {
        root = null;
        size = 0;
    }


    public boolean insert(int value) {
        if (root == null) root = new BTNode(value);
        else {
            BTNode parent = null, current = root;
            while (current != null) {
                if (value < current.data) {
                    parent = current;
                    current = current.left;
                }
                else if (value > current.data) {
                    parent = current;
                    current = current.right;
                }
                else return false; // exist, can’t insert
            }
            if (value < parent.data) {
                parent.left = new BTNode(value);
                parent.left.parent = parent;
            } else {
                parent.right = new BTNode(value);
                parent.right.parent = parent;
            }
        }
        size++;
        return true;		// insert successful
    }


}


