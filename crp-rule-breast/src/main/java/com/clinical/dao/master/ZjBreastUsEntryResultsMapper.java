package com.clinical.dao.master;
import com.clinical.model.master.BREAST_US_ENTRY_RESULTS;
import java.util.List;

public interface ZjBreastUsEntryResultsMapper {
    List<BREAST_US_ENTRY_RESULTS>  findZjBreastUsEntryResultsByUniqueId(String unique_id_lv2);

}