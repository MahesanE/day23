package sg.edu.nus.iss.day23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.day23.model.Order;
import sg.edu.nus.iss.day23.repository.OrderRepo;

@Service
public class OrderService {
    @Autowired
    OrderRepo ordRepo;

    public List<Order> findByOrderId(Integer id){
        return ordRepo.findByOrderId(id);
    }
}
