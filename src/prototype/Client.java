package prototype;

import static prototype.PrototypeRegistry.ModelType.ALBUM;
import static prototype.PrototypeRegistry.ModelType.MOVIE;
import static prototype.PrototypeRegistry.ModelType.SHOW;

public class Client {

    public static void main(String[] args) {
        try {
            System.out.println(PrototypeRegistry.getInstance(MOVIE));
            System.out.println(PrototypeRegistry.getInstance(ALBUM));
            System.out.println(PrototypeRegistry.getInstance(SHOW));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
