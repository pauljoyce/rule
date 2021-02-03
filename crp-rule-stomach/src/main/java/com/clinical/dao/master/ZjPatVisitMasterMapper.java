package com.clinical.dao.master;
import com.clinical.model.master.PAT_VISIT_MASTER;
import java.util.List;

public interface ZjPatVisitMasterMapper {
    List<PAT_VISIT_MASTER>  findZjPatVisitMasterByUniqueId(String unique_id_lv2);

    List<String> findZjPatVisitMasterByIncr();
}