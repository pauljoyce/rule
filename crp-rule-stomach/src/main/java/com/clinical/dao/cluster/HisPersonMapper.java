package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HisPerson;
public interface HisPersonMapper {
    List<HisPerson>  findHisPersonByUniqueId(String uniqueId);
    void   saveHisPerson(HisPerson hisPerson);
    void   updateHisPerson(HisPerson hisPerson);
    void   deleteHisPerson(String unique_id);

}