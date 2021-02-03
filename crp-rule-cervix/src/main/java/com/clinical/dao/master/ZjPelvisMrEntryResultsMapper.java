package com.clinical.dao.master;
import com.clinical.model.master.PELVIS_MR_ENTRY_RESULTS;
import java.util.List;

public interface ZjPelvisMrEntryResultsMapper {
    List<PELVIS_MR_ENTRY_RESULTS>  findZjPelvisMrEntryResultsByUniqueId(String unique_id_lv2);

}