package ee.valiit.back_3nurka.domain.user;

import ee.valiit.back_3nurka.login.LoginResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "userId", target = "id")
    @Mapping(source = "roleId", target = "role.id")
    @Mapping(source = "roleType", target = "role.type")
    User loginResponseToUser(LoginResponse loginResponse);

    @InheritInverseConfiguration(name = "loginResponseToUser")
    LoginResponse userToLoginResponse(User user);

    @InheritConfiguration(name = "loginResponseToUser")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User updateUserFromLoginResponse(LoginResponse loginResponse, @MappingTarget User user);
}
