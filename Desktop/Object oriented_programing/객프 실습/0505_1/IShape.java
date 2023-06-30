interface IShape {
    public double getArea();
    public double getPerimeter();
    default public void print() {
        System.out.println("IShape");
    }
}