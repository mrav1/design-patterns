package factory_method;

public class PolygonFactory {

    public static Polygon getPolygon(PolygonType type){
        Polygon polygon = null;
        switch (type){
            case TRIANGLE:
                polygon = new Triangle();
                break;
            case SQUARE:
                polygon = new Square();
                break;

            case PENTAGON:
                polygon = new Pentagon();
                break;
        }
        return polygon;
    }

}
