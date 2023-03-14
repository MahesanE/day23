package sg.edu.nus.iss.day23.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer orderId;

    private Date orderDate;

    private Integer customerId;

    private Integer productId;

    private Float totalPrice;

    private Float costPrice;
}
