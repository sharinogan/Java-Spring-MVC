package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CoffeeController {
    
    @RequestMapping("/coffee-list")
    String[] m1() {
        String[] data = { "Latte", "Mocha", "Espresso", "Cappucino" };
        return data;
    }
}
