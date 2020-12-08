package am.picsart.lessons.binarytree;

import java.util.*;

public class BinaryTree {

    private Node root;


    public void add(Integer e) {
//        root = addNode(root,e); // recursive insertion version

        if (Objects.isNull(root)) {
            root = new Node(e);
            return;
        }

        Node current = root;
        Node parent;
        while (true) {
            parent = current;
            if (e < current.data) {
                current = current.left;
                if (Objects.isNull(parent.left)) {
                    parent.left = new Node(e);
                    break;
                }
            } else if (e > current.data) {
                current = current.right;
                if (Objects.isNull(parent.right)) {
                    parent.right = new Node(e);
                    break;
                }
            } else {
                break;
            }
        }
    }

    private Node addNode(Node node, Integer e) {
        if (Objects.isNull(node)) {
            return new Node(e);
        }
        if (e < node.data) {
            node.left = addNode(node.left, e);
        } else if (e > node.data) {
            node.right = addNode(node.right, e);
        }
        return node;
    }

    public void remove(Integer i) {
        Node currentNode = root;
        Node parentNode = root;
        boolean isLeft = false;
        while (!currentNode.data.equals(i)) { // find target element
            parentNode = currentNode;
            if (i < currentNode.data) {
                isLeft = true;
                currentNode = currentNode.left;
            } else {
                isLeft = false;
                currentNode = currentNode.right;
            }
            if (Objects.isNull(currentNode)) {
                throw new NoSuchElementException();
            }
        }

        if (Objects.isNull(currentNode.right) && Objects.isNull(currentNode.left)) { // case 1. element without children
            if (currentNode.data.equals(root.data)) {
                root = null;
                return;
            }
            if (isLeft) {
                parentNode.left = null;
            } else {
                parentNode.right = null;
            }
        } else if (Objects.isNull(currentNode.right) || Objects.isNull(currentNode.left)) { // case 2. element with one child
            if (Objects.isNull(currentNode.left)) {
                if (currentNode.data.equals(root.data)) {
                    root = currentNode.right;
                    return;
                }
                if (isLeft) {
                    parentNode.left = currentNode.right;
                } else {
                    parentNode.right = currentNode.right;
                }
            }
        } else {                      // case 3. element with two children
            Node substituteParent = currentNode;
            Node substitute = currentNode;
            Node currentSubstitute = currentNode.right;

            while (Objects.nonNull(currentSubstitute)) {
                substituteParent = substitute;
                substitute = currentSubstitute;
                currentSubstitute = currentSubstitute.left;
            }
            if (!substitute.data.equals(currentNode.right.data)) {
                substituteParent.left = substitute.right;
                substitute.right = currentNode.right;
            }
            if (currentNode.data.equals(root.data)) {
                root = substitute;
            } else if (isLeft) {
                parentNode.left = substitute;
            } else {
                parentNode.right = substitute;
            }
            substitute.left = currentNode.left;

        }

    }


    public boolean contains(Integer e) {
        Node currentNode = root;
        while (!currentNode.data.equals(e)) {
            if (e < currentNode.data) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
            if (Objects.isNull(currentNode)) {
                return false;
            }
        }
        return true;
    }


    // depth first in order <root> <left> <right>
    public void depthFirstPreOrder() {
        depthFirstPreOrder(root);
    }

    private void depthFirstPreOrder(Node node) {
        if (Objects.nonNull(node)) {
            System.out.print(node.data + " ");
            depthFirstPreOrder(node.left);
            depthFirstPreOrder(node.right);
        }
    }


    // depth first in order <left> <root> <right>
    public void depthFirstInOrder() {
        depthFirstInOrder(root);
    }

    private void depthFirstInOrder(Node node) {
        if (Objects.nonNull(node)) {
            depthFirstInOrder(node.left);
            System.out.print(node.data + " ");
            depthFirstInOrder(node.right);
        }

    }


    // breadth first , level-order
    public void breadthFirst() {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()) {
            Node current = nodeQueue.poll();
            System.out.print(current.data + " ");
            if (Objects.nonNull(current.left)) {
                nodeQueue.offer(current.left);
            }
            if (Objects.nonNull(current.right)) {
                nodeQueue.offer(current.right);
            }
        }
    }

}
