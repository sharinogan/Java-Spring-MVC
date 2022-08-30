package main;

public class Test {
    
    public void test1() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("70");
        assert check(result, 70.0);
    }
    
    public void test2() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("100");
        assert check(result, 95.0);
    }
    
    public void test3() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("180");
        assert check(result, 171.0);
    }
    
    public void test4() {
        CoffeeController c = new CoffeeController();
        double delta = 0.00000001;
        double result = c.m4("101");
        assert check(result, 95.95);
    }
    
    public void test5() {
        CoffeeController c = new CoffeeController();
        double result = c.m4("Love");
        assert check(result, -1.0);
    }
    
    boolean check(double result, double expected) {
        double delta = 0.00000001;
        return expected - delta <= result && result <= expected + delta;
    }
}

//  UAT - User Acceptance Test
//  Test Case
//  Number			Description			Expected Result      Actual Result
//    1				Enter 70			    70.0
//    2				Enter 100 		            95.0
//    3				Enter 180			   171.0
//    4				Enter 101                          95.95
//    5				Enter Love                          -1.0