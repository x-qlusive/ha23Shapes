package fh.java.geometry.model.threedim.curved;

/**
 * Created by Patrick on 07.11.2016.
 */
public class Ball extends Curved3D{
    private double radius;

    public Ball() {
    }

    public Ball(int x, int y, int z, double radius) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", Surface=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }

    @Override

    public double calculateVolume() {

        return (Math.PI*4*radius*radius*radius)/3;
    }

    @Override
    public double calculateSurfaceArea() {

        return Math.PI*4*radius*radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ball ball = (Ball) o;

        return Double.compare(ball.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
