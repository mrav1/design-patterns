package prototype;

import java.util.HashMap;
import java.util.Map;

import static prototype.PrototypeRegistry.ModelType.ALBUM;
import static prototype.PrototypeRegistry.ModelType.MOVIE;
import static prototype.PrototypeRegistry.ModelType.SHOW;

public class PrototypeRegistry {

    public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }

    public static Map<String, Prototypable> registry = new HashMap<>();

    static {
        registry.put(MOVIE, new Movie());
        registry.put(ALBUM, new Album());
        registry.put(SHOW, new Show());
    }

    public static Prototypable getInstance(String type) throws CloneNotSupportedException{
        return registry.get(type).clone();
    }

}
