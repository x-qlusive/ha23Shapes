package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.threedim.ThreeDimensional;
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
    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();
    }

    private void doIt() {
        List<GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);

        sumArea(shapeList);

        List<Circle> circleList = new ArrayList<>();
        for (GeometricShape shape : shapeList){
            if (shape instanceof Circle) {
                circleList.add((Circle) shape);
            }
        }
        System.out.println("--------circles ------");

        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }

    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(1,2,2.0));
        shapeList.add(new Circle(1,3,3.0));
        shapeList.add(new Circle(1,4,4.0));

        shapeList.add(new RightTriangle(11,22,10.0,11.0));
        shapeList.add(new RightTriangle(11,22,10.0,11.0));

        shapeList.add(new Diamond(1,2,20.1,20.2, 20.3));
        shapeList.add(new Diamond(1,2,20.20,21.11,20.31));

    }


    public double sumArea(List<GeometricShape> shapeList) {
        double areaSum = 0.0;
        double periSum = 0.0;
        double volSum = 0.0;
        double surfSum = 0.0;

        for (GeometricShape shape : shapeList) {
            if (shape instanceof TwoDimensional){
                areaSum+=((TwoDimensional) shape).calcArea();
                periSum+=((TwoDimensional) shape).calcPerimeter();
            }
            if (shape instanceof ThreeDimensional){
                volSum+=((ThreeDimensional) shape).calculateVolume();
                surfSum+=((ThreeDimensional) shape).calculateSurfaceArea();
            }
        }
    return areaSum;

        System.out.println("--------stream1 ------");
        shapeList


    }

}
