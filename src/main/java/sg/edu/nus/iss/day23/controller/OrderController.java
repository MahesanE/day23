package sg.edu.nus.iss.day23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.day23.payload.SearchRequest;
import sg.edu.nus.iss.day23.service.OrderRestTemplate;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderRestTemplate ort;

    public String searchOrder(Model model){
        SearchRequest sr = new SearchRequest();
        model.addAttribute("searchObject", sr);
        return "searchorder";
    }
}
