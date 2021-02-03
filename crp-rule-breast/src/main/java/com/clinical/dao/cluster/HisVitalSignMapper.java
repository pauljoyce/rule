package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HisVitalSign;
public interface HisVitalSignMapper {
    List<HisVitalSign>  findHisVitalSign(String uniqueId);
    void   saveHisVitalSign(HisVitalSign hisVitalSign);
    void   updateHisVitalSign(HisVitalSign hisVitalSign);

}