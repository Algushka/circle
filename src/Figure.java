import java.util.Objects;

public abstract class Figure {
    String colour;

    public Figure(String colour) {
        this.colour = colour;
    }

    public abstract double calcArea();
    //{
//double square=0;
//return square;

    //}

    @Override
    public String toString() {
        return "Figure{" +
                "colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Objects.equals(colour, figure.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(colour);
    }
}
