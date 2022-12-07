package ee.valiit.back_3nurka.domain.district;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DistrictMapper {
    @Mapping(source = "id", target = "districtId")
    @Mapping(source = "name", target = "districtName")
    DistrictDto toDistrictDto(District district);

    List<DistrictDto> toDistrictDtos(List<District> districts);

}
