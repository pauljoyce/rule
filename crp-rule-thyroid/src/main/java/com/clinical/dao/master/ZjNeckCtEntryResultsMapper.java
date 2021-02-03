package com.clinical.dao.master;
import com.clinical.model.master.NECK_CT_ENTRY_RESULTS;
import java.util.List;

public interface ZjNeckCtEntryResultsMapper {
    List<NECK_CT_ENTRY_RESULTS>  findZjNeckCtEntryResultsByUniqueId(String unique_id_lv2);

}