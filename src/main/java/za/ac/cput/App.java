package za.ac.cput;

/**
 * @author anongxa
 * BookTest.java
 *
 */
public class App 
{
    public static void assertEquals( Book expected, Book actual ) {
        assertTrue(expected.getTitle( ).equals( actual.getTitle( ) )
                && expected.getAuthor( ).equals( actual.getAuthor( ) ));
    }
}
