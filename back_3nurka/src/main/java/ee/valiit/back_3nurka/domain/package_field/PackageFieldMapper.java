package ee.valiit.back_3nurka.domain.package_field;

import ee.valiit.back_3nurka.business.bike.dto.PackageFieldDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PackageFieldMapper {
    PackageField toPackageField(PackageFieldDto packageFieldDto);

    PackageFieldDto toPackageFieldDto(PackageField packageField);

    List<PackageFieldDto> toPackageFieldDtos(List<PackageField> packageFields);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PackageField updatePackageFieldFromPackageFieldDto(PackageFieldDto packageFieldDto, @MappingTarget PackageField packageField);
}
