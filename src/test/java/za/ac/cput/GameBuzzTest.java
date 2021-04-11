package za.ac.cput;


import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * Honest Mpungu!
 * Student Number 215072081
 * Part-Time group
 * Group AssignmentG
 */


public class GameBuzzTest {
    private Object NameSurname2;
    private Object NameSurname1;
    private Object NameSurname;

    @Test
    public void shouldAnswerWithTrue() {

        String userName = "NameSurname";

        Assertions.assertFalse(!isValidUserName(NameSurname));
        assertFalse(isValidNameSurname(NameSurname1));
        asserFalse();

    }

    @Ignore
    public void ignoreThisTest() {

        assert true;
        System.out.println("Disabled Test ");

    }

    private void asserFalse() {
    }

    private void assertFalse(boolean validNameSurname) {
    }

    private boolean isValidUserName(Object nameSurname) {
        return false;
    }

    private boolean isValidNameSurname(Object nameSurname2) {
        return true;
    }
    public class Timeout {

        public void test() throws InterruptedException {
            TimeUnit.SECONDS.sleep(20);
            System.out.println("Time out testing ");
        }

    }
}
