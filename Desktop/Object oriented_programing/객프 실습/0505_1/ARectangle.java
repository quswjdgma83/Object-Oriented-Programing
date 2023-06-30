class ARectangle extends AbstractShape {
    private int width;
    private int height;
    
    public ARectangle(int w, int h) {
        width = w;
        height = h;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof ARectangle) {
            ARectangle r = (ARectangle) o;
            return width == r.width && height == r.height;
        }
        return false;
    }
    
}
    