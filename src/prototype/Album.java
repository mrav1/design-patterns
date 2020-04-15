package prototype;

public class Album implements Prototypable {
    private String name="A";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototypable clone() throws CloneNotSupportedException {
        System.out.println("Cloning album...");
        return (Album) super.clone();    }

    @Override
    public String toString() {
        return "AlbumMovie{" +
                "name='" + name + '\'' +
                '}';
    }
}
