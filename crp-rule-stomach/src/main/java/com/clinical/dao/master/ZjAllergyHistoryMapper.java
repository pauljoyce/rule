package com.clinical.dao.master;
import com.clinical.model.master.ALLERGY_HISTORY;
import java.util.List;

public interface ZjAllergyHistoryMapper {
    List<ALLERGY_HISTORY>  findZjAllergyHistoryByUniqueId(String unique_id_lv2);

    List<String> findZjAllergyHistoryByIncr();
}