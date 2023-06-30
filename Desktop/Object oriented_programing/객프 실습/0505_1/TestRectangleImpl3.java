// TestRectangleImpl3.java
class TestRectangleImpl3 {
    public static void main(String[] args) {
        IShape r = new RectangleImpl3(10., 20.);
        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
        r.print();
        r = new RectangleImpl2(15, 20);
        r.print();
    }
}