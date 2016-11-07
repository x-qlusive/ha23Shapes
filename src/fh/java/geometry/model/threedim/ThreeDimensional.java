package fh.java.geometry.model.threedim;

import fh.java.geometry.model.GeometricShape;

/**
 * Created by Patrick on 07.11.2016.
 */
public abstract class ThreeDimensional extends GeometricShape{

    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}
