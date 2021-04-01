package za.ac.cput;

import org.junit.Test;

public class ObjectIdentityTest {

    @Test
    public void testObjectEqualitySucceeds() {
        Object o1 = new Object();
        Object o2 = o1;

        assert o1.equals(o2);
    }

    @Test
    public void testObjectEqualityFails() {
        Object o1 = new Object();
        Object o2 = new Object();

        assert !o1.equals(o2);
    }
}

