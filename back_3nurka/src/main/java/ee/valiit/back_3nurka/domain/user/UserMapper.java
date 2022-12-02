package ee.valiit.back_3nurka.domain.user;

import ee.valiit.back_3nurka.business.login.LoginResponse;
import ee.valiit.back_3nurka.business.user.RegisterRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.id", target = "roleId")
    @Mapping(source = "role.type", target = "roleType")
    LoginResponse toLoginResponse(User user);

    User toEntity (RegisterRequest request);

}
