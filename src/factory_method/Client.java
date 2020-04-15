package factory_method;

public class Client {
    public static void main(String[] args) {
        Polygon polygon = PolygonFactory.getPolygon(PolygonType.PENTAGON);
        assert polygon != null;
        System.out.println(polygon.getType());
    }
}
