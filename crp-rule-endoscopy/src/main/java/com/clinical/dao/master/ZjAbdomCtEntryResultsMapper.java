package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_CT_ENTRY_RESULTS;
import java.util.List;

public interface ZjAbdomCtEntryResultsMapper {
    List<ABDOM_CT_ENTRY_RESULTS>  findZjAbdomCtEntryResultsByUniqueId(String unique_id_lv2);

}