package mx.jovannypcg.linkedlist.model;

/**
 * Defines linked list operations.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0
 *
 * @param <T> Data type that the list handles.
 */
public class LinkedList<T> implements List<T> {
    /**
     * The reference to the first list node.
     */
    private Node<T> header;

    /**
     * Counts the times a node is inserted into the list.
     */
    private int counter;

    /**
     * Add a new item into the list.
     *
     * @param value The item to be inserted.
     */
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        Node<T> currentNode;

        if (header == null) {
            header = new Node<T>();
        }

        currentNode = header;

        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);

        counter++;
    }

    /**
     * Verifies if the list is empty.
     *
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return header == null;
    }

    /**
     * Gets the size of the list.
     * @return The size of the list.
     */
    public int size() {
        return counter;
    }

    /**
     * Gets the content of the specified node by the
     * index sent as parameter.
     *
     * @param index The node index.
     */
    public T get(int index) {
        if (index <= 0) {
            return null;
        }

        Node<T> currentNode;

        if (header != null) {
            currentNode = header.getNext();

            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null) {
                    return null;
                }

                currentNode = currentNode.getNext();
            }

            return currentNode.getContent();
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append("[");

        if (header != null) {
            Node<T> currentNode = header.getNext();

            while (currentNode != null) {
                output.append(currentNode.getContent().toString()).append(" ");
                currentNode = currentNode.getNext();
            }
        }

        output.append("]");


        return output.toString();
    }
}
