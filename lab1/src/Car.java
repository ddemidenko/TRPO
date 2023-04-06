
public class Car {
    public Driver driver;
    public Engine engine;
    public String mark;
    public String classes;
    public double weight;

    public Car( String mark, String classes, double weight, Driver driver, Engine engine) {
        this.driver = driver;
        this.engine = engine;
        this.mark = mark;
        this.classes = classes;
        this.weight = weight;
    }
}
