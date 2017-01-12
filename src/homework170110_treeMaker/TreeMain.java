package homework170110_treeMaker;

/**
 * Created by dhgof_000 on 2017-01-10.
 */
public class TreeMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addRoot("이게 뿌리노드이다");
        binaryTree.addLeft(binaryTree.root, "뿌리에서 막 왼쪽으로 내려온 데이타");
        binaryTree.addRight(binaryTree.root, "뿌리에서 막 오른쪽으로 내려온 데이타");
        binaryTree.addLeft(binaryTree.root.right, "뿌리에서 오른쪽의 왼쪽에 데이터");
        binaryTree.addRight(binaryTree.root.right, "뿌리에서 오른쪽의 오른쪽에 데이터");
        //System.out.println(binaryTree.root.right.right.data);
        binaryTree.allPrintTree();
    }
}
