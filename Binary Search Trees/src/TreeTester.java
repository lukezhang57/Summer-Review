public class TreeTester {
    public static void main(String[] args){
        BinarySearchTree t = new BinarySearchTree();
        t.add(2);
        t.add(1);
        t.add(4);
        t.add(3);
        t.add(5);
        t.invertTree();
        t.preOrderPrint();
    }
}
