package homework170110_treeMaker;

/**
 * Created by dhgof_000 on 2017-01-10.
 */
public class TreeMain {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addRoot("이게 뿌리노드이다");
        System.out.println(binaryTree.root.data);
        binaryTree.addLeft("뿌리에서 막 왼쪽으로 내려온 데이타");
        System.out.println(binaryTree.root.left.data);
        binaryTree.addRight("뿌리에서 막 오른쪽으로 내려온 데이타");
        System.out.println(binaryTree.root.right.data);


    }
}
