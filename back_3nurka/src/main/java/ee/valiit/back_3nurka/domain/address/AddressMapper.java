package ee.valiit.back_3nurka.domain.address;

import ee.valiit.back_3nurka.business.location.LocationResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AddressMapper {
    @Mapping(source = "addressId", target = "id")
    @Mapping(source = "districtId", target = "district.id")
    @Mapping(source = "districtName", target = "district.name")
    Address addressDtoToAddress(LocationResponse locationResponse);

    @InheritInverseConfiguration(name = "addressDtoToAddress")
    LocationResponse addressToAddressDto(Address address);
}
