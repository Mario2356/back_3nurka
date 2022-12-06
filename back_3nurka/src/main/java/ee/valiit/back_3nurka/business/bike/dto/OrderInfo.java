package ee.valiit.back_3nurka.business.bike.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderInfo {
    private String orderNumber;
    private Integer totalPrice;
    private List<BikeOrderDto> bikeOrders;
}
