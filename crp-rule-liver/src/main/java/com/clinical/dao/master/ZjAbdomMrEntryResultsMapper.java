package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_MR_ENTRY_RESULTS;
import java.util.List;

public interface ZjAbdomMrEntryResultsMapper {
    List<ABDOM_MR_ENTRY_RESULTS>  findZjAbdomMrEntryResultsByUniqueId(String unique_id_lv2);

    List<ABDOM_MR_ENTRY_RESULTS>  findZjAbdomMrEntryResultsByUniqueId2(String unique_id);

    List<String> findZjAbdomMrEntryResultsByIncr();
}