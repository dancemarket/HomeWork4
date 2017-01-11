package homework170108_tree;

/**
 * Created by dhgof_000 on 2017-01-08.
 */
public class TreeMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        //root를 세팅하라 "abc" 세팅하라

        TreeNode rootNode = new TreeNode();
        rootNode.name = "root";

        binaryTree.root = rootNode;

        TreeNode parent = rootNode;
//        TreeNode leftChild = new TreeNode();
//        leftChild.name = "leftChild";

        binaryTree.appendLeftChild(parent, "leftChild");
        System.out.println(rootNode.left.name);
        binaryTree.appendRightChild(parent, "rightChild");
        System.out.println(rootNode.right.name);
    }
}
