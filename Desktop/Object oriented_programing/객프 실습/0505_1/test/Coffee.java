package test;

class CoffeeBean {
    String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    void setSpecies(String s) { species = s;}
    void print2() {
        System.out.println("CB: print2");
    }
}

class Arabica extends CoffeeBean {
    @Override
    void print() {
        System.out.println("Arabica coffee...");
    }
}

class Robusta extends CoffeeBean {
    String species = "Robusta";
    @Override
    void print() {
        super.print();
        System.out.println("RobustaCoffee ...");
    }

    void print3() {
        super.print();
        System.out.println("print3");
    }
}

class Coffee {
    public static void main(String[] args) {
        CoffeeBean c = new CoffeeBean();
        c.print();//Coffee

        c = new Arabica();
        c.print();//Arabica coffee...

        Arabica a = new Arabica();
        a.print();//Arabica coffee...

        Robusta r = new Robusta();
        r.print();//Coffee
        r.print3();//print3

        c = r;
        c.print();
    }
}