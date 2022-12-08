package ee.valiit.back_3nurka.domain.bike_order;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class BikeOrderDomService {

    @Resource
    private BikeOrderRepository bikeOrderRepository;
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

    public BikeOrder findBikeOrderById(Integer bikeOrderId) {
        Optional<BikeOrder> byId = bikeOrderRepository.findById(bikeOrderId);
        BikeOrder bikeOrder = byId.get();
        return bikeOrder;
    }

    public void save(BikeOrder bikeOrder) {
        bikeOrderRepository.save(bikeOrder);

    }
}

