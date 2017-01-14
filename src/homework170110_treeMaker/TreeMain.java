package homework170110_treeMaker;

import java.util.ArrayList;

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
        System.out.print("In-Order 출력 : ");
        binaryTree.inOrder();
        System.out.println("");
        System.out.print("Pre-Order 출력 : ");
        binaryTree.preOrder();
        System.out.println("");
        System.out.print("Post-Order 출력 : ");
        binaryTree.postOrder();
        System.out.println("");
        //레벨 탐색형이라면 아래와 같이 출력되어야 함
        //P F S B H R Y G T Z W
        System.out.print("Level-Order 출력(index 0 부터 1 레벨): ");
        binaryTree.levelOrder();
    }
}
