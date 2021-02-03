package com.clinical.dao.master;
import com.clinical.model.master.TRANSFUSION_HISTORY;
import java.util.List;

public interface ZjTransfusionHistoryMapper {
    List<TRANSFUSION_HISTORY>  findZjTransfusionHistoryByUniqueId(String unique_id_lv2);

    List<String> findZjTransfusionHistoryByIncr();
}