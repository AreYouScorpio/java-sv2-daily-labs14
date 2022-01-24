package day01;

public class Product {

    private String name;
    private String type;
    private int piece;

    public Product(String name, String type, int piece) {
        this.name = name;
        this.type = type;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPiece() {
        return piece;
    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", piece=" + piece +
                '}';
    }
}
