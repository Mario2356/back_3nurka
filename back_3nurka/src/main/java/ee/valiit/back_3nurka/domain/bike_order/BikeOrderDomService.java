package ee.valiit.back_3nurka.domain.bike_order;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BikeOrderDomService {

    @Resource
    BikeOrderRepository bikeOrderRepository;
    public void addBikeOrder(BikeOrder bikeOrder) {
        bikeOrderRepository.save(bikeOrder);

    }

public List<BikeOrder> findBikeOrdersBy(Integer orderId) {
    List<BikeOrder> entities = bikeOrderRepository.findByOrder(orderId);
    return entities;
}

public List<BikeOrder> findAllOrders() {
    List<BikeOrder> orders = bikeOrderRepository.findAll();
    return orders;
}
}
