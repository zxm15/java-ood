package JukeBox;

/**
 * Created by zxm on 10/9/15.
 */
public class Song {
    private int id;
    private CD cd;
    private String artist;
    private double length;
    private String gene;

    public Song(int id, CD cd, String artist, double length, String gene) {
        this.id = id;
        this.cd = cd;
        this.artist = artist;
        this.length = length;
        this.gene = gene;
    }
    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }
}
