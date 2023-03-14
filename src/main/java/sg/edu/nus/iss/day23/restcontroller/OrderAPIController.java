package sg.edu.nus.iss.day23.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.day23.model.Order;
import sg.edu.nus.iss.day23.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderAPIController {
    @Autowired
    OrderService ordSvc;

    @GetMapping("/{order-id}")
    public ResponseEntity<List<Order>> findByOrderId(@PathVariable("order-id") Integer id){
        List<Order> orders = ordSvc.findByOrderId(id);

        if(orders.size() > 0){
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<> (null, HttpStatus.NO_CONTENT);
        }
    }
}
