package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HisFamily;
public interface HisFamilyMapper {
    List<HisFamily>  findHisFamily(String uniqueId);
    void   saveHisFamily(HisFamily hisFamily);
    void   updateHisFamily(HisFamily hisFamily);

}