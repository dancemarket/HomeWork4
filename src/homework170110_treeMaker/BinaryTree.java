package homework170110_treeMaker;

/**
 * Created by dhgof_000 on 2017-01-10.
 */
public class BinaryTree {
    int count = 0;      //레벨 탐색형 바이너리 노드?
    TreeNode root;      //데이터 없는 뿌리 노드 생성

    //뿌리노드 값을 추가하는 메소드
    public void addRoot(String data){
        TreeNode newNode = new TreeNode(data);
        newNode.left = root;
        root = newNode;
        newNode.parent = root;      //기존에 뿌리 노드가 있을 수 도 있으니 서로 연결 해주고 있음
        count++;
    }
    //사용자가 지정한 노드에서 이제 왼쪽아래로 뻗어 내려가는 메소드 작성
    public void addLeft(TreeNode nodePoint, String data){
        TreeNode newNode = new TreeNode(data);
        nodePoint.left = newNode;
        newNode.parent = root;
        count++;
    }
    //사용자가 지정한 노드에서 이제 왼쪽아래로 뻗어 내려가는 메소드 작성
    public void addRight(TreeNode nodePoint, String data){
        TreeNode newNode = new TreeNode(data);
        nodePoint.right = newNode;
        newNode.parent = root;
        count++;
    }

    //노드 삭제 하는것
    public void rightDelete(TreeNode nodePoint){
        nodePoint.parent = null;
        nodePoint.parent.right = null;
        count--;
    }
    public void leftDelete(TreeNode nodePoint){
        nodePoint.parent = null;
        nodePoint.parent.left = null;
        count--;
    }

    //노드를 전체 돌아가면서 찾아 출력하는 것
    public void allPrintTree(){
        searchTree(this.root);
    }
    public void searchTree(TreeNode nowNode){
        // 넘어온 노드 데이터 존재 유무 확인 후 프린트
        if (nowNode.data.equals(null)){
            return;
        }else {
            System.out.println(nowNode.data);
            try{
                searchTree(nowNode.left);
            }catch (NullPointerException e){
            }
            try{
                searchTree(nowNode.right);
            }catch (NullPointerException e){
            }

        }

    }
    //method
    //pre-order

}
