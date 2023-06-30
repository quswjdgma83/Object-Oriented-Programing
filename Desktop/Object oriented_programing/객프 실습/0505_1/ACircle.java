class ACircle extends AbstractShape {
    int radius;
    
    public ACircle(int r) {
        radius = r;
    }
    
    @Override   
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override    
    public double getPerimeter() {
            return Math.PI * radius * 2;
    }
}