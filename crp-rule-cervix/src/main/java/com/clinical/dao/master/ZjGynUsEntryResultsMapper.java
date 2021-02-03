package com.clinical.dao.master;
import com.clinical.model.master.GYN_US_ENTRY_RESULTS;
import java.util.List;

public interface ZjGynUsEntryResultsMapper {
    List<GYN_US_ENTRY_RESULTS>  findZjGynUsEntryResultsByUniqueId(String unique_id_lv2);

}