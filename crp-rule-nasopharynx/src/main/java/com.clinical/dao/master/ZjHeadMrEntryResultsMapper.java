package com.clinical.dao.master;
import com.clinical.model.master.HEAD_MR_ENTRY_RESULTS;
import java.util.List;

public interface ZjHeadMrEntryResultsMapper {
    List<HEAD_MR_ENTRY_RESULTS>  findZjHeadMrEntryResultsByUniqueId(String unique_id_lv2);

}