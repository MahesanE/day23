package sg.edu.nus.iss.day23.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import sg.edu.nus.iss.day23.model.Order;

@Service
public class OrderRestTemplate {

    RestTemplate restTemplate = new RestTemplate();

    private static final String GETORDERBYID_ENDPOINT_URL = "http://localhost:4000/api/orders/{order-id}";

    public List<Order> findOrderById(Integer id) {
        ResponseEntity<List<Order>> result = restTemplate.exchange(GETORDERBYID_ENDPOINT_URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Order>>() {

                }, id);
                return result.getBody();
    }
}
