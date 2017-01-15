package homework170114_treeAuto;

/**
 * Created by dhgof_000 on 2017-01-14.
 */
public class TreeAction {
    TreeNodeAT root;

    //뿌리노드 값을 추가하는 메소드
    public void addRoot(int data){
        TreeNodeAT newNode = new TreeNodeAT(data);
        root = newNode;
    }

    //왼쪽으로 갈지 오른쪽으로 갈지 정하는 메소드
    public void crossroadsAndAdd(TreeNodeAT node, int data){
        TreeNodeAT newNode = new TreeNodeAT();
        if (node.data == 0){
            node.data = data;
            return;
        }else {
            if (node.data >= data){
                if (node.left == null){
                    node.left = newNode;
                    newNode.parent = node;
                    crossroadsAndAdd(newNode, data);
                }else{
                    crossroadsAndAdd(node.left, data);
                }
            }else{
                if (node.right == null){
                    node.right = newNode;
                    newNode.parent = node;
                    crossroadsAndAdd(newNode, data);
                }else{
                    crossroadsAndAdd(node.right, data);
                }
            }
        }
    }

    //pre-order 출력하는 것
    public void preOrder(){
        preSearch(this.root);
    }
    public void preSearch(TreeNodeAT nowNode){
        if (nowNode == null) {
            return;
        }
        System.out.print(nowNode.data+" ");
        preSearch(nowNode.left);
        preSearch(nowNode.right);
    }
}
