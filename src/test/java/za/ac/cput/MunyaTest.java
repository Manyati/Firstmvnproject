package za.ac.cput;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MunyaTest {

    private Munya m, n, p;

    @Before
    public void setUp() throws Exception {
        m = new Munya("Bob", 32);
        n = new Munya("Munya", 23);
        p = new Munya("Bob", 32);

    }

    @Test
    public void testIdentity() {
assertSame(m,m);
        System.out.println("Test Identity");
    }

    @Test
    public void testEquality() {
assertEquals(p,p);
        System.out.println("Test Equality");
    }

    @Test
    public void shouldAnswerWithTrue() {

        assertTrue(true);
        System.out.println("Condition True ");
    }

    @Test
    public void testFailure() {

        assert false;
        System.out.println("Failing test ");
    }

    @Ignore
    public void ignoreThisTest() {

        assert true;
        System.out.println("Disabled Test ");
    }

    @Test
    public void timeTest() throws InterruptedException {
        new ManyatiTest.Timeout().test();
        System.out.println("Timed Test ");
    }

    public class Timeout {

        public void test() throws InterruptedException {
            TimeUnit.SECONDS.sleep(60);
            System.out.println("Time out testing ");
        }
    }
}