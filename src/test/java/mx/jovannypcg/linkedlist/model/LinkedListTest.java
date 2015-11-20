package mx.jovannypcg.linkedlist.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Tests the operations of the LinkedList data type.
 *
 * @author  OCPJP Jovanny Pablo Cruz Gomez.
 *          Software Engineer.
 *          jovannypcg@yahoo.com
 *
 * @version 1.0
 */
@RunWith(MockitoJUnitRunner.class)
public class LinkedListTest {
    /**
     * The list to test.
     */
    private List<Integer> list;

    @Before
    public void setUp() throws Exception {
        list = new LinkedList<Integer>();
    }

    @Test
    public void list_shouldBeEmpty() {
        /*  ===================================================================
         *      Act
         *  =================================================================*/

        boolean result = list.isEmpty();

        /*  ===================================================================
         *      Assert
         *  =================================================================*/

        assertEquals(true, result);
    }

    @Test
    public void list_shouldNotBeEmpty() {
        /*  ===================================================================
         *      Arrange
         *  =================================================================*/

        list.add(1);

        /*  ===================================================================
         *      Act
         *  =================================================================*/

        boolean result = list.isEmpty();

        /*  ===================================================================
         *      Assert
         *  =================================================================*/

        assertEquals(false, result);
    }

    @Test
    public void list_shouldGetTheCorrectSize() {
        /*  ===================================================================
         *      Arrange
         *  =================================================================*/

        list.add(1);
        list.add(2);
        list.add(3);

        /*  ===================================================================
         *      Act
         *  =================================================================*/

        int listSize = list.size();

        /*  ===================================================================
         *      Assert
         *  =================================================================*/

        assertEquals(3, listSize);
    }

    @Test
    public void listSize_shouldBeZero() {
        /*  ===================================================================
         *      Act
         *  =================================================================*/

        int listSize = list.size();

        /*  ===================================================================
         *      Assert
         *  =================================================================*/

        assertEquals(0, listSize);
    }

    @Test
    public void list_shouldGetTheCorrectItem() {
        /*  ===================================================================
         *      Arrange
         *  =================================================================*/

        final int WANTED_VALUE = 67;
        final int TESTED_INDEX = 3;

        list.add(4);
        list.add(54);
        list.add(26);
        list.add(WANTED_VALUE);
        list.add(2);
        list.add(573);

        /*  ===================================================================
         *      Act
         *  =================================================================*/

        int value = list.get(TESTED_INDEX);

        /*  ===================================================================
         *      Assert
         *  =================================================================*/

        assertEquals(WANTED_VALUE, value);
    }
}
