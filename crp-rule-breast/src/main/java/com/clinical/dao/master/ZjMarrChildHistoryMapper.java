package com.clinical.dao.master;
import com.clinical.model.master.MARR_CHILD_HISTORY;
import java.util.List;

public interface ZjMarrChildHistoryMapper {
    List<MARR_CHILD_HISTORY>  findZjMarrChildHistoryByUniqueId(String unique_id_lv2);

}