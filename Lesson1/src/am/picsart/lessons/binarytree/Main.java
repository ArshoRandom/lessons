package am.picsart.lessons.binarytree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(1);
        tree.add(0);
        tree.add(3);
        tree.add(-2);
        tree.add(2);
        tree.add(5);
        tree.add(-1);

        System.out.println("Breadth first level-order");
        tree.breadthFirst();
        System.out.println("\nDepth first in order");
        tree.depthFirstInOrder();
        System.out.println("\nDepth first pre order <root> <left> <right>");
        tree.depthFirstPreOrder();

        System.out.println("\n2 contains in tree ? - "  + (tree.contains(2) ? "Yes" : "No"));
        System.out.println("Remove 2");
        tree.remove(2);
        System.out.println("2 contains in tree ? - "  + (tree.contains(2) ? "Yes" : "No"));

    }
}
