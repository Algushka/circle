import java.util.Objects;

public class Square extends Figure {
    private int side;

    public Square(String colour, int side) {
        super(colour);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {

        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", colour='" + colour + '\'' +
                '}';
    }
    @Override
    public double calcArea(){
        double square=0.0;
        square=Math.pow(side,2);
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }
}
