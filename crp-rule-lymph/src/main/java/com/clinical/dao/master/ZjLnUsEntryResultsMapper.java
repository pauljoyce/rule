package com.clinical.dao.master;
import com.clinical.model.master.LN_US_ENTRY_RESULTS;
import java.util.List;

public interface ZjLnUsEntryResultsMapper {
    List<LN_US_ENTRY_RESULTS>  findZjLnUsEntryResultsByUniqueId(String unique_id_lv2);

}