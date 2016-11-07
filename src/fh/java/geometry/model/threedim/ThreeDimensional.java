package fh.java.geometry.model.threedim;

import fh.java.geometry.model.GeometricShape;

/**
 * Created by Patrick on 07.11.2016.
 */
public abstract class ThreeDimensional extends GeometricShape{


    protected int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ThreeDimensional that = (ThreeDimensional) o;

        return z == that.z;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + z;
        return result;
    }

    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();


}
