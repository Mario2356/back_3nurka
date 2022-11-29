package ee.valiit.back_3nurka.domain.bike;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface BrandMapper {
    @Mapping(source = "id", target = "brandId")
    @Mapping(source = "name", target = "brandName")
    @Mapping(source = "isOther", target = "brandIsOther")
    BrandDto brandToBrandDto(Brand brand);

}
