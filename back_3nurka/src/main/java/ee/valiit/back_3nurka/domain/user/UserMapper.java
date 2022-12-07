package ee.valiit.back_3nurka.domain.user;

import ee.valiit.back_3nurka.business.location.LocationDto;
import ee.valiit.back_3nurka.business.login.LoginResponse;
import ee.valiit.back_3nurka.business.user.dto.RegisterRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.id", target = "roleId")
    @Mapping(source = "role.type", target = "roleType")
    LoginResponse toLoginResponse(User user);

    User toEntity(RegisterRequest request);

    @Mapping(source = "customer.address.district.name", target = "districtName")
    @Mapping(source = "customer.address.streetName", target = "streetName")
    @Mapping(source = "customer.address.phone", target = "phone")
    LocationDto toLocationDto(User user);
}

