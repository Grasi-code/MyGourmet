package ch.schule.MyGourmet;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class customerController {
    @GetMapping("/editcustomer")
    public String editCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "editcustomer";
    }
}
