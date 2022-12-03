package ee.valiit.back_3nurka.domain.work_type;

import ee.valiit.back_3nurka.domain.order_status.OrderStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class WorkTypeService {

    @Resource
    WorkTypeRepository workTypeRepository;


    public WorkType getWorkType(Integer workTypeId) {
        Optional<WorkType> byId = workTypeRepository.findById(workTypeId);
        WorkType workType = byId.get();
        return workType;
    }
}
