package ee.valiit.back_3nurka.domain.package_field;


import ee.valiit.back_3nurka.domain.work_type.WorkType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class PackageFieldService {

    @Resource
    PackageFieldRepository packageFieldRepository;


    public PackageField getPackageField(Integer packageId) {
        Optional<PackageField> byId = packageFieldRepository.findById(packageId);
        if (byId.isPresent()) {
            return byId.get();
        }
        else
            return null;
    }

    public List<PackageField> findPackageFieldsbyWorkType(Integer worktypeId) {
        List<PackageField> entities = packageFieldRepository.findByWorkTypeId(worktypeId);
        return entities;
    }

}
