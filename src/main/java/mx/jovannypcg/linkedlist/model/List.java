package mx.jovannypcg.linkedlist.model;

/**
 * Defines list operations.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0
 *
 * @param <T> Data type that the list handles.
 */
public interface List<T> {
    /**
     * Add a new item into the list.
     *
     * @param value The item to be inserted.
     */
    void add(T value);

    /**
     * Verifies if the list is empty.
     *
     * @return true if the list is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Gets the size of the list.
     * @return The size of the list.
     */
    int size();

    /**
     * Gets the content of the specified node by the
     * index sent as parameter.
     *
     * @param index The node index.
     */
    T get(int index);
}
