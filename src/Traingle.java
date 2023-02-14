public class Traingle extends Shapes {

    private double a;
    private double b;

    public Traingle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void findArea() {
        System.out.println("Trangle"+ a * b / 2);



    }

    @Override
    public String toString() {
        return "Traingle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

