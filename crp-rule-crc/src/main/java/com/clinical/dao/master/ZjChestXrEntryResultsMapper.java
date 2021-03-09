package com.clinical.dao.master;
import com.clinical.model.master.CHEST_XR_ENTRY_RESULTS;
import java.util.List;

public interface ZjChestXrEntryResultsMapper {
    List<CHEST_XR_ENTRY_RESULTS>  findZjChestXrEntryResultsByUniqueId(String unique_id_lv2);
    List<CHEST_XR_ENTRY_RESULTS>  findZjChestXrEntryResultsByALL();

}