package homework170114_treeAuto;

/**
 * Created by dhgof_000 on 2017-01-14.
 */
public class TreeNodeAT {
    int data;
    TreeNodeAT parent = null;
    TreeNodeAT left = null;
    TreeNodeAT right = null;

    public TreeNodeAT(){

    }
    public TreeNodeAT(int data){
        this.data = data;
        this.parent = null;
        this.left = null;
        this.right = null;
    }
}
