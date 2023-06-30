class TestEquals {
    public static void main(String[] args) {
        ARectangle r1 = new ARectangle(10, 20);
        ARectangle r2 = new ARectangle(20, 10);
        ARectangle r3 = new ARectangle(10, 20);
        ACircle c1 = new ACircle(10);
        System.out.println(r1 == r3);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r1.equals(c1));
    }
}