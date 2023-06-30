// RectangleImpl2.java
class RectangleImpl2 extends Rectangle implements IShape {
    public RectangleImpl2(double width, double height) {
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
}