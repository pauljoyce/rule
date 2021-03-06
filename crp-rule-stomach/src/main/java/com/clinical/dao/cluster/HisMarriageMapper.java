package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.HisMarriage;
public interface HisMarriageMapper {
    List<HisMarriage>  findHisMarriageByUniqueId(String uniqueId);
    void   saveHisMarriage(HisMarriage hisMarriage);
    void   updateHisMarriage(HisMarriage hisMarriage);
    void   deleteHisMarriage(String unique_id);

}