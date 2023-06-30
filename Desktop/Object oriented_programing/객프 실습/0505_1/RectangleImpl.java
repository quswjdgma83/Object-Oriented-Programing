// RectangleImpl.java
class RectangleImpl implements IShape {
    private double width, height;
    public RectangleImpl(double width, double height) {
        this.width = width;
        this.height = height;
    }
  
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}