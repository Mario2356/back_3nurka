package ee.valiit.back_3nurka.domain.bike;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BikeBrandMapper {
    @Mapping(source = "id", target = "brandId")
    @Mapping(source = "name", target = "brandName")
    @Mapping(source = "isOther", target = "brandIsOther")
    BikeBrandDto toBikeBrandDto(BikeBrand bikeBrand);
    List<BikeBrandDto> toBikeBrandDtos(List<BikeBrand>bikeBrands);
}
