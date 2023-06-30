class TestAbstractShape1 {
    public void print(AbstractShape s) {
        if (s instanceof ARectangle) {
            System.out.println(((ARectangle) s).getArea());
        }
        else if (s instanceof ACircle) {
            System.out.println(((ACircle) s).getArea());
        }
    }
    
    public static void main(String[] args) {
        AbstractShape r = new ARectangle(10, 20);
        TestAbstractShape1 s = new TestAbstractShape1();
        s.print(r);
        r = new ACircle(10);
        s.print(r);
    }
}