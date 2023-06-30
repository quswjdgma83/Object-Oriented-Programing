// TestRectangleImpl2.java
class TestRectangleImpl2 {
    public static void main(String[] args) {
        IShape r = new RectangleImpl2(10., 20.);
        System.out.printf("area: %.2f\n", r.getArea());
        System.out.printf("perimeter: %.2f\n", r.getPerimeter());
    }
}