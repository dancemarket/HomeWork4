package homework170108_tree;

/**
 * Created by dhgof_000 on 2017-01-08.
 */
public class BinaryTree<E> {
    TreeNode<E> root;

    // parent : root이고 이름이 leftchild인 parent-left 자식을 추가
    public void appendLeftChild(TreeNode parent, String name) {
        //왼쪽 자식을 추가
        //parent의 왼쪽이 leftNode다
        TreeNode leftNode = new TreeNode();

        parent.left = leftNode;      //parent의 왼쪽은 leftNode 이다;
        leftNode.parents = parent;      //leftNode의 부모는 treeNode타입의 parent 이다;
        leftNode.name = name;
        leftNode.left = null;
        leftNode.right = null;

    }




    //root에 right자식을 추가  하는 기능
    public void appendRightChild(TreeNode parent, String rightChild) {
        TreeNode rightNode = new TreeNode();
        parent.right = rightNode;   //parent의 오른쪽 자식은 rightNode다
        //rightNode의 parents는 root이다
        rightNode.parents = parent;
        rightNode.name = rightChild;
        rightNode.left = null;
        rightNode.right = null;

    }

    //method
    //pre-order

}
