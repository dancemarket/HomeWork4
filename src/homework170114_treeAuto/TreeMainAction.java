package homework170114_treeAuto;

/**
 * Created by dhgof_000 on 2017-01-14.
 */
public class TreeMainAction {
    public static void main(String[] args) {
        TreeAction treeAction = new TreeAction();
        treeAction.addRoot(30);
        treeAction.crossroadsAndAdd(treeAction.root, 40);
        treeAction.crossroadsAndAdd(treeAction.root, 50);
        treeAction.crossroadsAndAdd(treeAction.root, 20);
        treeAction.crossroadsAndAdd(treeAction.root, 10);
        treeAction.crossroadsAndAdd(treeAction.root, 25);
        treeAction.preOrder();
    }
}
