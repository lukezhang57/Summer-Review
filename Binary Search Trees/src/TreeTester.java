public class TreeTester {
    public static void main(String[] args){
        BinarySearchTree t = new BinarySearchTree();
        t.add(10);
        t.add(7);
        t.add(15);
        t.add(5);
        t.add(11);
        t.add(20);
        t.add(2);
        t.add(30);
        t.add(8);

        System.out.print("Height: ");
        System.out.println(t.findHeight());
        System.out.println("Expected: 4");

        System.out.print("Balanced: ");
        System.out.println(t.isBalanced());
        System.out.println("Expected: true");

        System.out.print("Sum: ");
        System.out.println(t.sum());
        System.out.println("Expected: 108");

        System.out.print("# of nodes: ");
        System.out.println(t.nodeCount());
        System.out.println("Expected: 9");

        System.out.print("# of leaves: ");
        System.out.println(t.numOfLeaves());
        System.out.println("Expected: 4");

        System.out.print("Sum of leaves: ");
        System.out.println(t.sumOfLeaves());
        System.out.println("Expected: 51");

        System.out.println(t.search(20));
        System.out.println("Expected: true");
    }
}
