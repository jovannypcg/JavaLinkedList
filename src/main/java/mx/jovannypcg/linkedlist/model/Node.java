package mx.jovannypcg.linkedlist.model;

/**
 * Represents a list node that holds its contain and the
 * reference to the next node.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0
 *
 * @param <T> Data type that the node handles.
 */
public class Node<T> {
    /**
     * The content of the node.
     */
    private T content;

    /**
     * Reference to the next node.
     */
    private Node<T> next;

    /**
     * Constructor.
     */
    public Node() {}

    /**
     * Constructor.
     *
     * @param content The content of the node.
     */
    public Node(T content) {
        this.content = content;
    }

    /**
     * Gets the content of the node.
     *
     * @return The content of the node.
     */
    public T getContent() {
        return content;
    }

    /**
     * Sets the content of the node.
     * @param content The content of the node.
     */
    public void setContent(T content) {
        this.content = content;
    }

    /**
     * Gets the reference to the next node
     * @return The reference to the next node.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the reference to the next node.
     * @param next The reference to the next node.
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
