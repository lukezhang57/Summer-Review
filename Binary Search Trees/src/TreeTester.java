import java.util.*;

public class TreeTester {
    public static void main(String[] args){
        BinarySearchTree t = new BinarySearchTree();
        t.add(2);
        t.add(1);
        t.add(4);
        t.add(3);
        t.add(5);
        t.add(17);
        t.add(100);
        BinarySearchTree r = new BinarySearchTree();
        r.add(2);
        r.add(1);
        r.add(4);
        r.add(3);
        r.add(5);
        r.add(17);
        r.add(100);
        System.out.println(BinarySearchTree.isIdentical(t.root,r.root));
    }
}
