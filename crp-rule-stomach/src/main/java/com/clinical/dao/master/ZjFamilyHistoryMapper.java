package com.clinical.dao.master;
import com.clinical.model.master.FAMILY_HISTORY;
import java.util.List;

public interface ZjFamilyHistoryMapper {
    List<FAMILY_HISTORY>  findZjFamilyHistoryByUniqueId(String unique_id_lv2);

    List<String> findZjFamilyHistoryByIncr();
}