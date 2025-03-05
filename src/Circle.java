import java.util.Objects;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String colour) {
        super(colour);
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }
    @Override
    public double calcArea(){
        double square=0.0;
        square=3.14*Math.pow(radius,2);
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }
}
