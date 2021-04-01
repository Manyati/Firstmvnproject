package za.ac.cput;

/*
Name: Sanele Ngwenya
Student No.: 216019699
Group: pt
*/

public class Coordinates {

    private final int x;
    private final int y;

    private String reflectedBinaryCode;

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Coordinates(int x, int y, String reflectedBinaryCode){
        this.x = x;
        this.y = y;
        this.reflectedBinaryCode = reflectedBinaryCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getReflectedBinaryCode() {
        return reflectedBinaryCode;
    }
}
