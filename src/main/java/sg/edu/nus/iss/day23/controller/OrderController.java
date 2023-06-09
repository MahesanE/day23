package sg.edu.nus.iss.day23.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.day23.model.Order;
import sg.edu.nus.iss.day23.payload.SearchRequest;
import sg.edu.nus.iss.day23.service.OrderRestTemplate;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderRestTemplate ort;
    
    @GetMapping
    public String searchOrder(Model model){
        SearchRequest sr = new SearchRequest();
        model.addAttribute("searchObject", sr);
        return "searchorder";
    }

    @PostMapping("/search")
    public String processSearch(@ModelAttribute("searchObject") SearchRequest sr, Model model, BindingResult result){

        List<Order> orders = ort.findOrderById(sr.getOrderId());

        model.addAttribute("orders", orders);

        return "orderlist";
        
    }
}
