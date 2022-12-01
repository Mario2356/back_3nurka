package ee.valiit.back_3nurka.domain.bike;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeMapper {
    @Mapping(source = "bikeId", target = "id")
    @Mapping(source = "brandId", target = "brand.id")
    @Mapping(source = "brandName", target = "brand.name")
    @Mapping(source = "brandIsOther", target = "brand.isOther")
    @Mapping(source = "userId", target = "user.id")
    @Mapping(source = "bikeModel", target = "model")
    Bike bikeDtoToBike(BikeDto bikeDto);

    @InheritInverseConfiguration(name = "bikeDtoToBike")
    BikeDto bikeToBikeDto(Bike bike);

    @InheritConfiguration(name = "bikeDtoToBike")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Bike updateBikeFromBikeDto(BikeDto bikeDto, @MappingTarget Bike bike);
}
