package mx.jovannypcg.linkedlist;

import mx.jovannypcg.linkedlist.model.LinkedList;
import mx.jovannypcg.linkedlist.model.List;

/**
 * Demostrates the usage of the LinkedList data type.
 *
 * @author OCPJP Jovanny Pablo Cruz Gomez.
 *         Software Engineer.
 *         jovannypcg@yahoo.com
 *
 * @version 1.0.
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();

        list.add(4);
        list.add(5);
        list.add(45);
        list.add(473);
        list.add(164);
        list.add(4);
        list.add(2746);
        list.add(4);
        list.add(8);
        list.add(0);
        list.add(-23);
        list.add(24);
        list.add(7876);

        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("List size: " + list.size());
        System.out.println("Item at index 6: " + list.get(6));
        System.out.println("List members: " + list.toString());
    }
}
