package homework170110_treeMaker;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by dhgof_000 on 2017-01-10.
 */
public class BinaryTree {
    TreeNode root;      //데이터 없는 뿌리 노드 생성
    Stack stack = new Stack();
    Queue queue = new LinkedList();

    //뿌리노드 값을 추가하는 메소드
    public void addRoot(String data){
        TreeNode newNode = new TreeNode(data);
        root = newNode;
    }
    //사용자가 지정한 노드에서 이제 왼쪽아래로 뻗어 내려가는 메소드 작성
    public void addLeft(TreeNode nodePoint, String data){
        TreeNode newNode = new TreeNode(data);
        nodePoint.left = newNode;
        newNode.parent = nodePoint;
    }
    //사용자가 지정한 노드에서 이제 왼쪽아래로 뻗어 내려가는 메소드 작성
    public void addRight(TreeNode nodePoint, String data){
        TreeNode newNode = new TreeNode(data);
        nodePoint.right = newNode;
        newNode.parent = nodePoint;
    }

    //노드 삭제 하는것
    public void rightDelete(TreeNode nodePoint){
        nodePoint.parent = null;
        nodePoint.parent.right = null;
    }
    public void leftDelete(TreeNode nodePoint){
        nodePoint.parent = null;
        nodePoint.parent.left = null;
    }

    //pre-order 출력하는 것
    public void preOrder(){
        preSearch(this.root);
    }
    public void preSearch(TreeNode nowNode){
        if (nowNode == null) {
            return;
        }
        System.out.print(nowNode.data+" ");
        preSearch(nowNode.left);
        preSearch(nowNode.right);
    }

    //post-order 출력하는 것
    public void postOrder(){
        postSearch(this.root);
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
    public void postSearch(TreeNode nowNode){
        // 넘어온 노드 데이터 존재 유무 확인 후 프린트
        if (nowNode == null) {
            return;
        }
        stack.push(nowNode.data);
        postSearch(nowNode.right);
        postSearch(nowNode.left);
    }

    //in-order 출력(중위형)
    public void inOrder(){
        inSearch(this.root);
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }

    public void inSearch(TreeNode nowNode) {
        if (nowNode == null){
            return;
        }
        stack.push(nowNode.data);
        inSearch(nowNode.left);
        queue.offer(stack.pop());
        inSearch(nowNode.right);

    }

}
