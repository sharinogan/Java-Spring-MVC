package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;     // environment
        context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup {
    
}

@RestController
class Sample {
    
    @RequestMapping("/check")
    int  m1() {
        Runtime r = Runtime.getRuntime();
        return r.availableProcessors();
    }
    
    // https://localhost:30000/coffee/order?price=350
    @RequestMapping("/coffee/order")
    String m2(String price) {
        try {
            double p = Double.valueOf(price);
            p = p * 0.90;
            return "Total is " + p;
        } catch (Exception e) {
            return "Invalid Number";
        }
    }
    
    // https://localhost:30000/coffee/total?price=350&shipping=40
    @RequestMapping("/coffee/total")
    String m3(String price, String shipping) {
        try {
            double p = Double.valueOf(price);
            double s = Double.valueOf(shipping);
            return "Total for this product is " + (p + s);
        } catch (Exception e) {
            return "You not enter the price or shipping value!!!";
        }
    }
}