package com.clinical.dao.master;
import com.clinical.model.master.CHEST_CT_ENTRY_RESULTS;
import java.util.List;

public interface ZjChestCtEntryResultsMapper {
    List<CHEST_CT_ENTRY_RESULTS>  findZjChestCtEntryResultsByUniqueId(String unique_id_lv2);
    List<CHEST_CT_ENTRY_RESULTS>  findZjChestCtEntryResultsByALL();

}