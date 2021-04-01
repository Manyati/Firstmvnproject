package za.ac.cput;

/*
Name: Sanele Ngwenya
Student No.: 216019699
Group: pt
*/

import junit.framework.TestCase;

public class CoordinatesTest extends TestCase {
    private final Coordinates C_TEST = new Coordinates(3, 3);

    public void testGetX() {
        assertEquals(C_TEST.getX(), 3);
    }
    public void testGetY() {
    }
    public void testGetReflectedBinaryCode() {
    }
}