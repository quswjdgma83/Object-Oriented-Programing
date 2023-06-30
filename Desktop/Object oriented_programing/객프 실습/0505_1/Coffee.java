// CoffeeBean.java
class CoffeeBean {
    String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    void setSpecies(String s) {
        species = s ;
    }
    void print2() {
        System.out.println("CB: print2");
    }
}

// Arabica.java
class Arabica extends CoffeeBean {   
    @Override
    void print() {
        System.out.println("Arabica coffee...");
    }
}
 
// Robusta.java
class Robusta extends CoffeeBean {
    String species = "Robusta";
    @Override
    void print() {
        super.print();
        System.out.println("Robusta coffee...");
    }
    
    void print3() {
        super.print();
        //print();
        System.out.println("print3");
    }
}

class Coffee {
    public static void main(String[] args) {    
        CoffeeBean c = new CoffeeBean();
        c.print();
        
        c = new Arabica();
        c.print();
        
        Arabica a = new Arabica();
        a.print();
        
        Robusta r = new Robusta();
        r.print();
        r.print3();
        
        c = r;
        c.print();
    }
}