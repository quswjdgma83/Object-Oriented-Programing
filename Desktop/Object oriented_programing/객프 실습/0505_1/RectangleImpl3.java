// RectangleImpl3.java
class RectangleImpl3 extends Rectangle implements IShape {
    public RectangleImpl3(double width, double height) {
        super(width, height);
    }    
    @Override
    public double getArea() {
         return getWidth() * getHeight();
    }
    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
    
    public void print() {
        System.out.println("RectangleImpl3");
    }
}