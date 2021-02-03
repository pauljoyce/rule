package com.clinical.dao.master;
import com.clinical.model.master.HEAD_CT_ENTRY_RESULTS;
import java.util.List;

public interface ZjHeadCtEntryResultsMapper {
    List<HEAD_CT_ENTRY_RESULTS>  findZjHeadCtEntryResultsByUniqueId(String unique_id_lv2);

}