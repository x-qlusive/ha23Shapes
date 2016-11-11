package fh.java.geometry.model.threedim.curved;

/**
 * Created by Patrick on 07.11.2016.
 */
public class Cone extends Curved3D {

    private double radius;
    private double height;
    private double side;

    public Cone() {
    }

    public Cone(int x, int y, int z, double radius, double height, double side) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
        this.height = height;
        this.side = side;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cone{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", side=").append(side);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", Surface=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculateVolume() {

        return (Math.PI*radius*radius*height)/3;
    }

    @Override
    public double calculateSurfaceArea() {

        return Math.PI*radius*(radius+side);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cone cone = (Cone) o;

        if (Double.compare(cone.radius, radius) != 0) return false;
        if (Double.compare(cone.height, height) != 0) return false;
        return Double.compare(cone.side, side) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
