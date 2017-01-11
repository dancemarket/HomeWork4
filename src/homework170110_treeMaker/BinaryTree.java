package homework170110_treeMaker;

/**
 * Created by dhgof_000 on 2017-01-10.
 */
public class BinaryTree {
    int level = 0;      //레벨 탐색형 바이너리 노드?
    TreeNode root;      //데이터 없는 뿌리 노드 생성

    //뿌리노드 값을 추가하는 메소드
    public void addRoot(String data){
        TreeNode newNode = new TreeNode(data);
        newNode.left = root;
        root = newNode;
        newNode.parent = root;      //기존에 뿌리 노드가 있을 수 도 있으니 서로 연결 해주고 있음
        level++;
    }

    //뿌리노드에서 이제 왼쪽아래로 뻗어 내려가는 메소드 작성
    public void addLeft(String data){
        TreeNode newNode = new TreeNode(data);
        root.left = newNode;
        newNode.parent = root;
        level++;
    }

    //뿌리노드에서 이제 왼쪽아래로 뻗어 내려가는 메소드 작성
    public void addRight(String data){
        TreeNode newNode = new TreeNode(data);
        root.right = newNode;
        newNode.parent = root;
        level++;
    }
    //method
    //pre-order

}
