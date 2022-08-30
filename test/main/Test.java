package main;

public class Test {
    
    public void test1() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("70");
        assert result == 70;
    }
    
    public void test2() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("100");
        assert result == 95.0;
    }
    
    public void test3() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("180");
        assert result == 171.0;
    }
    
    public void test4() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("101");
        assert result == 95.95;
    }
    
    public void test5() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("Love");
        assert result == -1.0;
    }
}