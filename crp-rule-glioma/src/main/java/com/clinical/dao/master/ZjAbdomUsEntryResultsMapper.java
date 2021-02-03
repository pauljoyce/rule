package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_US_ENTRY_RESULTS;
import java.util.List;

public interface ZjAbdomUsEntryResultsMapper {
    List<ABDOM_US_ENTRY_RESULTS>  findZjAbdomUsEntryResultsByUniqueId(String unique_id_lv2);

}