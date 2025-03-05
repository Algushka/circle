import java.util.Objects;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String colour, int length, int width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", colour='" + colour + '\'' +
                '}';
    }
    public double calcArea(){
        double square=0.0;
        square=width*length;
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width);
    }
}
