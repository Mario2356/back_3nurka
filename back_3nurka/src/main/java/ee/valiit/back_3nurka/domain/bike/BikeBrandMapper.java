package ee.valiit.back_3nurka.domain.bike;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeBrandMapper {
    @Mapping(source = "brandId", target = "id")
    @Mapping(source = "brandName", target = "name")
    @Mapping(source = "brandIsOther", target = "isOther")
    BikeBrand bikeBrandDtoToBikeBrand(BikeBrandDto bikeBrandDto);

    @InheritInverseConfiguration(name = "bikeBrandDtoToBikeBrand")
    BikeBrandDto bikeBrandToBikeBrandDto(BikeBrand bikeBrand);

    @InheritConfiguration(name = "bikeBrandDtoToBikeBrand")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    BikeBrand updateBikeBrandFromBikeBrandDto(BikeBrandDto bikeBrandDto, @MappingTarget BikeBrand bikeBrand);
}
