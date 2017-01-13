package homework170110_treeMaker;

/**
 * Created by dhgof_000 on 2017-01-10.
 */
public class TreeMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addRoot("P");
        binaryTree.addLeft(binaryTree.root, "F");
        binaryTree.addRight(binaryTree.root, "S");
        binaryTree.addLeft(binaryTree.root.left, "B");
        binaryTree.addRight(binaryTree.root.left, "H");
        binaryTree.addLeft(binaryTree.root.left.right, "G");
        binaryTree.addLeft(binaryTree.root.right, "R");
        binaryTree.addRight(binaryTree.root.right, "Y");
        binaryTree.addRight(binaryTree.root.right.right, "Z");
        binaryTree.addLeft(binaryTree.root.right.right, "T");
        binaryTree.addRight(binaryTree.root.right.right.left, "W");


//        System.out.println(binaryTree.root.right.right.data);
        binaryTree.preOrder();
        System.out.println("");
        binaryTree.postOrder();
    }
}
