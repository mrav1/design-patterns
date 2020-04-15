package prototype;

public class Movie implements Prototypable {
    private String name="M";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototypable clone() throws CloneNotSupportedException {
        System.out.println("Cloning movie...");
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
