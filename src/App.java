import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
    }

    private static void runIntTree(){
        IntTree tree = new IntTree();
        tree.insert(10);
        tree.insert(15);
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        System.out.println("Pre Order");
        tree.preOrder();
        System.out.println("\nPos Order");
        tree.posOrder();
        System.out.println("\nIn Order");
        tree.inOrder();
        System.out.println("\nTamaño");
        tree.size();
    }
}
