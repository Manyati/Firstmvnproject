package za.ac.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @Author Munyaradzi Manyati
 * @std 215211855
 * Unit test for simple Manyati.
 */
public class ManyatiTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testFailure() {
        assert false;
    }

    @Ignore
    public void ignoreThisTest() {

        assert true;
    }

    @Test
    public void timeTest() throws InterruptedException {
        new Timeout().test();
    }

    public class Timeout {

        public void test() throws InterruptedException {
            TimeUnit.SECONDS.sleep(60);
        }
    }
}
