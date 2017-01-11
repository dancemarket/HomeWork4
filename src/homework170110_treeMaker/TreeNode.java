package homework170110_treeMaker;

/**
 * Created by dhgof_000 on 2017-01-10.
 */
public class TreeNode<String> {
    String data;
    TreeNode parent;    //단순연결 리스트는 한방향으로만 연결되어 있는거에 반해, 트리는 거슬로 올라가는것도 필요함
    TreeNode left;
    TreeNode right;

    public TreeNode(String data){
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }
}
