package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_XR_ENTRY_RESULTS;
import java.util.List;

public interface ZjAbdomXrEntryResultsMapper {
    List<ABDOM_XR_ENTRY_RESULTS>  findZjAbdomXrEntryResultsByUniqueId(String unique_id_lv2);

}