package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.threedim.ThreeDimensional;
import fh.java.geometry.model.threedim.curved.Ball;
import fh.java.geometry.model.threedim.curved.Cone;
import fh.java.geometry.model.threedim.quadrangular.Cuboid;
import fh.java.geometry.model.twodim.TwoDimensional;
import fh.java.geometry.model.twodim.curved.Circle;
import fh.java.geometry.model.twodim.quadrangular.Diamond;
import fh.java.geometry.model.twodim.triangular.RightTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Patrick on 07.11.2016.
 */
public class Main {
    private double areaSum = 0.0;
    private double periSum = 0.0;
    private double volSum = 0.0;
    private double surfSum = 0.0;

    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();
    }

    private void doIt() {
        List<GeometricShape> shapeListTwoDim = new ArrayList<>();
        List<GeometricShape> shapeListThreeDim = new ArrayList<>();
        fillList(shapeListTwoDim, shapeListThreeDim);
        sumArea(shapeListTwoDim, "2-Dimensional Shapes");
        sumArea(shapeListThreeDim, "3-Dimensional Shapes");
        System.out.format("Areas: %.2f%nPerimeters: %.2f%nVolumes: %.2f%nSurfaces: %.2f%n",areaSum,periSum,volSum,surfSum);
    }

    public void fillList(List<GeometricShape> shapeListTwo, List<GeometricShape> shapeListThree) {

        shapeListTwo.add(new Circle(1, 2, 2.0));
        shapeListTwo.add(new Circle(1, 3, 3.0));
        shapeListTwo.add(new Circle(1, 4, 4.0));

        shapeListTwo.add(new RightTriangle(11, 22, 10.0, 11.0));
        shapeListTwo.add(new RightTriangle(11, 22, 10.0, 11.0));

        shapeListTwo.add(new Diamond(1, 2, 20.1, 20.2, 20.3));
        shapeListTwo.add(new Diamond(1, 2, 20.20, 21.11, 20.31));

        shapeListThree.add(new Ball(1, 2, 3, 13.0));
        shapeListThree.add(new Ball(1, 2, 3, 14.0));
        shapeListThree.add(new Ball(1, 2, 3, 15.0));

        shapeListThree.add(new Cone(1, 2, 3, 5.0, 10.0, 15.0));
        shapeListThree.add(new Cone(1, 2, 3, 5.0, 10.0, 15.0));
        shapeListThree.add(new Cone(1, 2, 3, 5.0, 10.0, 15.0));

        shapeListThree.add(new Cuboid(1, 2, 3, 10.0, 15.0, 20.0));
        shapeListThree.add(new Cuboid(1, 2, 3, 10.0, 15.0, 20.0));
        shapeListThree.add(new Cuboid(1, 2, 3, 10.0, 15.0, 20.0));

    }

    public double sumArea(List<GeometricShape> shapeList,String dimension) {

        for (GeometricShape shape : shapeList) {
            if (shape instanceof TwoDimensional) {
                areaSum += ((TwoDimensional) shape).calcArea();
                periSum += ((TwoDimensional) shape).calcPerimeter();
            }
            if (shape instanceof ThreeDimensional) {
                volSum += ((ThreeDimensional) shape).calculateVolume();
                surfSum += ((ThreeDimensional) shape).calculateSurfaceArea();
            }
        }

        System.out.println(dimension);
        shapeList
                .stream()
                .forEach(System.out::println);
    return 0;}

}
