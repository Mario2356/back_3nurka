package ee.valiit.back_3nurka.domain.bike;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BikeService {
    @Resource
    private BikeRepository bikeRepository;


    public void addBike(Bike bike) {
        bikeRepository.save(bike);
    }
}
