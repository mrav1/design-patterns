package prototype;

public class Show implements Prototypable {
    private String name="S";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototypable clone() throws CloneNotSupportedException {
        System.out.println("Cloning show...");
        return (Show) super.clone();    }

    @Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                '}';
    }
}
