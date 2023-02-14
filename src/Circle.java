public class Circle extends Shapes{
    private double PI = 3.14;
   private double a;

    public Circle(double PI,double a) {
        this.PI = PI;
        this.a = a;


    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    @Override
    public void findArea(){

        System.out.println(Math.PI*(a*a));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                '}';
    }
}
