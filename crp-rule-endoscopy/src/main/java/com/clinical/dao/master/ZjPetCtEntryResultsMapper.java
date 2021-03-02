package com.clinical.dao.master;
import com.clinical.model.master.PET_CT_ENTRY_RESULTS;
import java.util.List;

public interface ZjPetCtEntryResultsMapper {
    List<PET_CT_ENTRY_RESULTS>  findZjPetCtEntryResultsByUniqueId(String unique_id_lv2);

    List<PET_CT_ENTRY_RESULTS>  findZjPetCtEntryResultsByUniqueId2(String unique_id);

}