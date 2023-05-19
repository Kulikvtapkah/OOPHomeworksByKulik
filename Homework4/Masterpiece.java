package OOPHomeworksByKulik.Homework4;

import java.text.Format;

public class Masterpiece implements Comparable<Masterpiece> {
    private String name;
    private String artist;
    private int price;

    public Masterpiece(String name, String artist, int price) {
        this.artist = artist;
        this.name = name;
        this.price = price;

    }

    @Override
    public int compareTo(Masterpiece otherMasterpiece) {
        return Integer.compare(this.price, otherMasterpiece.price);

    }

    @Override
    public String toString() {

        return String.format("\n%s %s: %s млн.$.", name, artist, price);
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public int getPrice() {
        return price;
    }
}
