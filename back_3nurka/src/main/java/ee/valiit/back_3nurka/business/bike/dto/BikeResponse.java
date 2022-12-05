package ee.valiit.back_3nurka.business.bike.dto;

import lombok.Data;

@Data
public class BikeResponse {
    private String brandName;
    private String bikeModel;
    private Integer bikeId;
    private Integer brandId;
}
