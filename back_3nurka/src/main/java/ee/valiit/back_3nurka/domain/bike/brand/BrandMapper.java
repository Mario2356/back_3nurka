package ee.valiit.back_3nurka.domain.bike.brand;

import ee.valiit.back_3nurka.business.bike.BikeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BrandMapper {

    @Mapping(source = "id", target = "brandId")
    @Mapping(source = "name", target = "brandName")
    @Mapping(source = "isOther", target = "brandIsOther")
    BrandDto toBrandDto(Brand brand);

    List<BrandDto> toBrandDtos(List<Brand> brands);


    @Mapping(source = "brandName", target = "name")
    Brand brandDtoToBrand(BikeRequest dto);
}
