class TestARectangle {
    public static void main(String[] args) {
        AbstractShape r = new ARectangle(10, 20);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
/*        r = new ACircle(10, 20);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        */
    }
}