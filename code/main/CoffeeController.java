package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CoffeeController {
    
    // https://localhost:30000/pay?price=150
    @RequestMapping("/pay")
    double m4(String price) {
        try {
            double p = Double.valueOf(price);
            
            if(p >= 100) 
                
                return p * 0.95;
            else
                return p;
        } catch (Exception e) {
            return -1;
        }
    }
    
    @RequestMapping("/coffee-list")
    String[] m1() {
        String[] data = { "Latte", "Mocha", "Espresso", "Cappucino" };
        return data;
    }
}
