public class BinarySearchTree {
    public Node root;

    class Node{
        public Comparable value;
        public Node left;
        public Node right;

        public void addNode(Node n){
            int difference = n.value.compareTo(this.value);
            if (difference < 0){
                if (left == null){
                    left = n;
                }
                else {
                    left.addNode(n);
                }
            }
            else if (difference > 0){
                if (right == null){
                    right = n;
                }
                else {
                    right.addNode(n);
                }
            }
        }
    }

    public BinarySearchTree(){
        this.root = null;
    }

    public BinarySearchTree(Comparable rootValue){
        this.root = new Node();
        this.root.value = rootValue;
        this.root.left = null;
        this.root.right = null;
    }

    public BinarySearchTree(Comparable rootValue, BinarySearchTree left, BinarySearchTree right){
        this.root = new Node();
        this.root.value = rootValue;
        this.root.left = left.root;
        this.root.right = right.root;
    }

    public void add(Comparable o){
        Node n = new Node();
        n.value = o;
        if (this.root == null){
            this.root = n;
        }
        else {
            this.root.addNode(n);
        }
    }

    public static void preOrderPrint(Node n){
        if (n == null){
            return;
        }
        System.out.print(n.value + " ");
        preOrderPrint(n.left);
        preOrderPrint(n.right);
    }

    public void preOrderPrint(){
        preOrderPrint(this.root);
        System.out.println();
    }
    public static void postOrderPrint(Node n){
        if (n == null){
            return;
        }
        postOrderPrint(n.left);
        postOrderPrint(n.right);
        System.out.print(n.value + " ");
    }

    public void postOrderPrint(){
        postOrderPrint(this.root);
        System.out.println();
    }
    public static void inOrderPrint(Node n){
        if (n == null){
            return;
        }
        inOrderPrint(n.left);
        System.out.print(n.value + " ");
        inOrderPrint(n.right);
    }

    public void inOrderPrint(){
        inOrderPrint(this.root);
        System.out.println();
    }

    public int sum(){
        return sum(this.root);
    }

    private int sum(Node r){
        if (r == null){
            return 0;
        }
        if (r.right == null && r.left == null){
            return (Integer) r.value;
        }
        return (Integer) r.value + sum(r.left) + sum(r.right);
    }

    public int nodeCount(){
        return nodeCount(this.root);
    }

    private int nodeCount(Node r){
        if (r == null){
            return 0;
        }
        if (r.right == null && r.left == null){
            return 1;
        }
        return 1 + nodeCount(r.left) + nodeCount(r.right);
    }

    public int findHeight(){
        return findHeight(this.root);
    }

    private int findHeight(Node r){
        if (r == null){
            return 0;
        }
        if (r.right == null && r.left == null){
            return 1;
        }
        return 1 + nodeCount(r.left) + nodeCount(r.right);
    }
}
