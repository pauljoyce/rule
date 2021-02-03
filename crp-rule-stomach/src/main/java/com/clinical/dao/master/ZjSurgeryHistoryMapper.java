package com.clinical.dao.master;
import com.clinical.model.master.SURGERY_HISTORY;
import java.util.List;

public interface ZjSurgeryHistoryMapper {
    List<SURGERY_HISTORY>  findZjSurgeryHistoryByUniqueId(String unique_id_lv2);

    List<String> findZjSurgeryHistoryByIncr();
}