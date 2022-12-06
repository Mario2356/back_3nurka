package ee.valiit.back_3nurka.domain.address;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AddressMapper {
    @Mapping(source = "addressId", target = "id")
    @Mapping(source = "districtId", target = "district.id")
    @Mapping(source = "districtName", target = "district.name")
    Address addressDtoToAddress(AddressDto addressDto);

    @InheritInverseConfiguration(name = "addressDtoToAddress")
    AddressDto addressToAddressDto(Address address);
}
