package za.ac.cput;

/**
 * @author Asanda Mabaso
 *
 *This is a simple app
 */
public class App
{
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
