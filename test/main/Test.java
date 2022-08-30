package main;

public class Test {
    
    public void test1() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("70");
        assert result == 70;
    }
}