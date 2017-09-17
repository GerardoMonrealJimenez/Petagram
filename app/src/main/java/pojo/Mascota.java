package pojo;

/**
 * Created by Gerardo Monreal on 17/09/2017.
 */

public class Mascota {
    private int image;
    private int raiting;
    private String name;

    public Mascota(int image, int raiting, String name) {
        this.image = image;
        this.raiting = raiting;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
