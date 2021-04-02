package za.ac.cput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Honest Mpungu!
 * Student Number 215072081
 * Part-Time group
 * Group Assignment
 */
public class AppTest {

    private Assertions Assert;

    @Test
    public void testNumber() {
        GameBuzz gameBuzz = new GameBuzz();
        
        int number =2;
         String numberReturned = gameBuzz.play(number);
         Assert.assertEquals("2",numberReturned);
        
    }
    
    
    
    
    
    
    
    
}

