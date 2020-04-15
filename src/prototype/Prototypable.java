package prototype;

public interface Prototypable extends Cloneable {
    Prototypable clone() throws CloneNotSupportedException;
}
