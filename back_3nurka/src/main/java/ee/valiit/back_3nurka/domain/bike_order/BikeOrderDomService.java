package ee.valiit.back_3nurka.domain.bike_order;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BikeOrderDomService {

    @Resource
    BikeOrderRepository bikeOrderRepository;
    public void addBikeOrder(BikeOrder bikeOrder) {
        bikeOrderRepository.save(bikeOrder);

    }
}
