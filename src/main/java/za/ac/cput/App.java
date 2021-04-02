package za.ac.cput;

/**

 * @author anongxa
 * BookTest.java

 * @author Asanda Mabaso

 *
 *This is a simple app
 */


public class App

{

    public static void assertEquals( Book expected, Book actual ) {
        assertTrue(expected.getTitle( ).equals( actual.getTitle( ) )
                && expected.getAuthor( ).equals( actual.getAuthor( ) ));

    private String category, music;

    public String getId() {
        return category;
    }

    public void setId(String id) {
        this.category = id;
    }

    public String getName() {
        return  music;
    }

    public void setName(String name) {
        this.music = name;
    }

    @Override
    public String toString() {
        return "App{" +
                "id='" + category + '\'' +
                ", music='" + music + '\'' +
                '}';

    }
}
