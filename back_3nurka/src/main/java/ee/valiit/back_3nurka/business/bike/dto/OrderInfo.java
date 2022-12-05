package ee.valiit.back_3nurka.business.bike.dto;

import com.sun.xml.bind.annotation.XmlIsSet;
import lombok.Data;

import java.util.List;

@Data
public class OrderInfo {
    private String orderNumber;
    private List<BikeOrderDto> bikeOrders;
}
