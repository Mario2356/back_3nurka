package ee.valiit.back_3nurka.domain.bike;

import ee.valiit.back_3nurka.business.bike.dto.BikeResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class BikeService {
    @Resource
    private BikeRepository bikeRepository;

    @Resource
    private BikeMapper bikeMapper;



    public void addBike(Bike bike) {
        bikeRepository.save(bike);
    }

    public List<BikeResponse> getBikesByUserId(Integer userId) {
        List<Bike> bikes = bikeRepository.findBikeBy(userId, "A");
        List<BikeResponse> bikeResponses = bikeMapper.toBikeResponses(bikes);
        return bikeResponses;

    }
    public void deleteBikeBy(Integer bikeId) {
        Bike bike = bikeRepository.findById(bikeId).get();
        bike.setStatus("D");
        bikeRepository.save(bike);
    }

    public Bike getBikeById(Integer bikeId) {
        Optional<Bike> byId = bikeRepository.findById(bikeId);
        Bike bike = byId.get();
        return bike;
    }
}
