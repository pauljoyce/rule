package com.clinical.dao.master;
import com.clinical.model.master.BREAST_MG_ENTRY_RESULTS;
import java.util.List;

public interface ZjBreastMgEntryResultsMapper {
    List<BREAST_MG_ENTRY_RESULTS>  findZjBreastMgEntryResultsByUniqueId(String unique_id_lv2);

}