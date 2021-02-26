package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HisPerson;
public interface HisPersonMapper {
    List<HisPerson>  findHisPerson(String uniqueId);
    void   saveHisPerson(HisPerson hisPerson);
    void   updateHisPerson(HisPerson hisPerson);

}