package com.clinical.dao.master;
import com.clinical.model.master.NECK_MR_ENTRY_RESULTS;
import java.util.List;

public interface ZjNeckMrEntryResultsMapper {
    List<NECK_MR_ENTRY_RESULTS>  findZjNeckMrEntryResultsByUniqueId(String unique_id_lv2);

}