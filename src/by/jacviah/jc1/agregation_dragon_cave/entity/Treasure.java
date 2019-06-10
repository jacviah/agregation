package by.jacviah.jc1.agregation_dragon_cave.entity;

/**
 * Created by jacviah on 10.06.2019.
 */
public class Treasure {

    private String name;
    private int price;
    private Size size;


    public Treasure(String name, int price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Treasure{" + "\n" +
                "name = " + name + ",\n" +
                "price = " + price + ",\n" +
                "size = " + size + ",\n" +
                '}' + "\n";
    }
}
