package com.clinical.dao.master;
import com.clinical.model.master.MENSTRUAL_HISTORY;
import java.util.List;

public interface ZjMenstrualHistoryMapper {
    List<MENSTRUAL_HISTORY>  findZjMenstrualHistoryByUniqueId(String unique_id_lv2);

}