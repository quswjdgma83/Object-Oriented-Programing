class TestAbstractShape2 {
    public void print(AbstractShape s) {
        System.out.println(s.getArea());
    }
    
    public static void main(String[] args) {
        AbstractShape r = new ARectangle(10, 20);
        TestAbstractShape1 s = new TestAbstractShape1();
        s.print(r);
        r = new ACircle(10);
        s.print(r);
    }
}