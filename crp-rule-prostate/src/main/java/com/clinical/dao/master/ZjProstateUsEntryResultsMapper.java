package com.clinical.dao.master;
import com.clinical.model.master.PROSTATE_US_ENTRY_RESULTS;
import java.util.List;

public interface ZjProstateUsEntryResultsMapper {
    List<PROSTATE_US_ENTRY_RESULTS>  findZjProstateUsEntryResultsByUniqueId(String unique_id_lv2);

}