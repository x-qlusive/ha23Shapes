package fh.java.geometry.model.threedim.quadrangular;

import fh.java.geometry.model.twodim.quadrangular.*;

/**
 * Created by Patrick on 07.11.2016.
 */
public class Cuboid extends QuadrangularShape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Cuboid() {
    }

    public Cuboid(int x, int y, int z, double sideA, double sideB, double sideC) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cuboid{");
        sb.append("side A=").append(sideA);
        sb.append("side B=").append(sideB);
        sb.append("side C=").append(sideC);
        sb.append(", Volume=").append(calculateVolume());
        sb.append(", Surface=").append(calculateSurfaceArea());
        sb.append('}');
        return sb.toString();
    }
    @Override
    public double calculateVolume() {

        return sideA*sideB*sideC;
    }

    @Override
    public double calculateSurfaceArea() {

        return 2*(sideA*sideB+sideA*sideC+sideB*sideC);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cuboid cuboid = (Cuboid) o;

        if (Double.compare(cuboid.sideA, sideA) != 0) return false;
        if (Double.compare(cuboid.sideB, sideB) != 0) return false;
        return Double.compare(cuboid.sideC, sideC) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
