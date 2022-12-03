package ee.valiit.back_3nurka.domain.bike_status;


import ee.valiit.back_3nurka.domain.package_field.PackageField;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class BikeStatusService {

    @Resource
    BikeStatusRepository bikeStatusRepository;

    public BikeStatus getBikeStatus(Integer bikeStatusId) {
        Optional<BikeStatus> byId = bikeStatusRepository.findById(bikeStatusId);
        BikeStatus bikeStatus = byId.get();
        return bikeStatus;

    }
}
