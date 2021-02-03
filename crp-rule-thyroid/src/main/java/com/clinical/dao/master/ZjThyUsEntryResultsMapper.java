package com.clinical.dao.master;
import com.clinical.model.master.THY_US_ENTRY_RESULTS;
import java.util.List;

public interface ZjThyUsEntryResultsMapper {
    List<THY_US_ENTRY_RESULTS>  findZjThyUsEntryResultsByUniqueId(String unique_id_lv2);

}