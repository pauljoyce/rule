package com.clinical.dao.master;
import com.clinical.model.master.WARD_ROUND_RECORD;
import java.util.List;

public interface ZjWardRoundRecordMapper {
    List<WARD_ROUND_RECORD>  findZjWardRoundRecordByUniqueId(String unique_id_lv2);

}