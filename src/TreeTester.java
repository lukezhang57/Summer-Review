public class TreeTester {
    public static void main(String[] args){
        BinarySearchTree t = new BinarySearchTree();
        t.add(5);
        t.add(3);
        t.add(8);
        t.add(1);
        t.add(4 );
        t.add(6);
        t.add(11);
        System.out.println(t.nodeCount());
        System.out.println("Expected: 7");
    }
}
