package fh.java.geometry.model.twodim.quadrangular;

/**
 * Created by Patrick on 07.11.2016.
 */
public class Diamond extends QuadrangularShape {

    private double diamE;
    private double diamF;
    private double sideA;

    public Diamond() {
    }

    public Diamond(int x, int y, double diamE, double diamF, double sideA) {
        this.x = x;
        this.y = y;
        this.diamE = diamE;
        this.diamF = diamF;
        this.sideA = sideA;
    }

    public double getDiamE() {
        return diamE;
    }

    public void setDiamE(double diamE) {
        this.diamE = diamE;
    }

    public double getDiamF() {
        return diamF;
    }

    public void setDiamF(double diamF) {
        this.diamF = diamF;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calcArea() {
        return (diamE*diamF)/2;
    }

    @Override
    public double calcPerimeter() {

        return 4*sideA;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diamond{");
        sb.append("sideA=").append(sideA);
        sb.append("diameter E").append(diamE);
        sb.append("diameter F").append(diamF);
        sb.append(", area=").append(calcArea());
        sb.append(", perimeter=").append(calcPerimeter());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Diamond diamond = (Diamond) o;

        if (Double.compare(diamond.diamE, diamE) != 0) return false;
        if (Double.compare(diamond.diamF, diamF) != 0) return false;
        return Double.compare(diamond.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(diamE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diamF);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
