package za.ac.cput;

/**
 * @author Asanda Mabaso
 *
 */

import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class TimeoutTest {

    @Test(timeout = 100)
    public void totalCashTest() throws InterruptedException {
        new Timeout().test();
    }

    public class Timeout {

        public void test() throws InterruptedException {
            TimeUnit.SECONDS.sleep(100);
        }
    }


}
