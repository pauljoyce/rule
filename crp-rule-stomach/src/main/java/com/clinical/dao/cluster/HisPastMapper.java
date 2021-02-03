package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HisPast;
public interface HisPastMapper {
    List<HisPast>  findHisPastByUniqueId(String uniqueId);
    void   saveHisPast(HisPast hisPast);
    void   updateHisPast(HisPast hisPast);
    void   deleteHisPast(String unique_id);

}