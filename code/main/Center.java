package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
class Web {
    @RequestMapping({"/", "/home"})
    String showIndex() {
        String[] list = {"/", "/home"};
        return "display";
    }
    
    @RequestMapping("/staff")
    String showStaff(Model m) {
        m.addAttribute("company", "iCoffee");
        m.addAttribute("location", "Bangkok");
        String[] data = { "Bill G", "Mark Z", "James B" };
        m.addAttribute("staff", data);
        return "display-staff";
    }
}

@RestController
class WebService {
    
}

class Product {
    double price;
    double getSpecialPrice() {
        return price * 0.90;
    }
}

class Book extends Product {
    @Override
    double getSpecialPrice() {
        return price * 0.85;
    }
}