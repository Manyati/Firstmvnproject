package za.ac.cput;

/** @author anongxa
 *  204513723
 *  Group:PT
 */

import static org.junit.jupiter.api.Assertions.*;

public class BookTest extends TestCase {

    public void testGetBook( ) {
        MockBookConnection mock = new MockBooConnection( );
        Book db = new Book( mock );
        Book book = db.getBook( "Cosmos", "Carl Sagan" );
        assertTrue( mock.validate( ) );
    }
}