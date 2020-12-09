package am.picsart.lessons.linkedlist;

import java.util.*;

public class LinkedList implements Iterable{

    private int size;
    private Node current;
    private Node first;


    public boolean add(Object e) {
        Node node = new Node(e);
        node.previous = current;

        if (Objects.nonNull(node.previous)) {
            node.previous.next = node;
        }

        node.next = null;
        this.current = node;
        if (size == 0) {
            this.first = this.current;
        }
        this.size++;
        return true;
    }

    public boolean add(int index, Object e) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
            return add(e);
        }
        int currentIndex = 0;
        Node currentNode = this.first;
        while (currentIndex != index) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        Node node = new Node(e);

        currentNode.previous.next = node;
        node.previous = currentNode.previous;
        node.next = currentNode;
        currentNode.previous = node;
        size++;
        return true;
    }


    public void addFirst(Object e){
        Node node = new Node(e);
        node.next = this.first;
        node.previous = null;
        this.first = node;
        this.size++;
    }


    public Object getFirst(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        return first.data;
    }


    public Object getLast(){
        if (size == 0){
            throw new NoSuchElementException();
        }
        return current.data;
    }


    public void addLast(Object e){
        add(e);
    }

    public boolean remove(Object e) {
        if (Objects.isNull(e)) {
            throw new NullPointerException();
        }
        Node currentNode = first;
        while (currentNode != null) {
            if (currentNode.data.equals(e)) {
                currentNode.next.previous = currentNode.previous;
                currentNode.previous.next = currentNode.next;
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean remove(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        int currentIndex = 0;
        Node currentNode = first;
        while (currentIndex != index && currentNode != null) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (currentIndex == 0) {
            currentNode.next.previous = null;
            this.first = currentNode.next;
            size--;
            return true;
        }
        if (currentIndex == size - 1) {
            currentNode.previous.next = null;
            size--;
            return true;
        }
        currentNode.next.previous = currentNode.previous;
        currentNode.previous.next = currentNode.next;
        size--;
        return true;
    }


    public int indexOf(Object e) {
        Node currentNode = first;
        for (int i = 0; i < size; i++) {
            if (currentNode.data.equals(e)) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public int lastIndexOf(Object e) {
        Node currentNode = current;
        for (int i = size; i >= 0; i--) {
            if (currentNode.data.equals(e)) {
                return i;
            }
            currentNode = currentNode.previous;
        }
        return -1;
    }

    public Object get(int index) {
        if (index < size && index >= 0) {
            Node currentNode = this.first;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    return currentNode.data;
                }
                currentNode = currentNode.next;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean set(int index, Object e) {
        if (index < size && index >= 0) {
            Node currentNode = first;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    currentNode.data = e;
                    return true;
                }
                currentNode = currentNode.next;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public Object element(){
        if (size > 0){
            return current.data;
        }
        throw new NoSuchElementException();
    }

    public Object peek(){
        if (size > 0){
            return current.data;
        }
        return null;
    }

    public Object poll(){
        if (size > 0){
            Object res = current.data;
            if (size == 1){
                current = null;
            }else {
                current.previous.next = null;
                current = current.previous;
            }
            size--;
            return res;
        }
        return null;
    }



    public boolean contains(Object e) {
        return indexOf(e) >= 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (size == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        Node currentNode = this.first;
        for (int i = 0; i < size; i++) {
            builder.append(currentNode.data).append(", ");
            currentNode = currentNode.next;
        }
       return builder.deleteCharAt(builder.lastIndexOf(",")).append("]").toString();
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = new Iterator() {

            private Node currentIter = first;

            @Override
            public boolean hasNext() {
                return currentIter != null;
            }

            @Override
            public Object next() {
                Object res = currentIter.data;
                currentIter = currentIter.next;
                return res;
            }
        };

       return iterator;
    }

    private class Node {
        Object data;
        Node next;
        Node previous;


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(data, node.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        public Node(Object data) {
            this.data = data;
        }
    }

}
