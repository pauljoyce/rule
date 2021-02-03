package com.clinical.dao.master;
import com.clinical.model.master.VITAL_RECORD;
import java.util.List;

public interface ZjVitalRecordMapper {
    List<VITAL_RECORD>  findZjVitalRecordByUniqueId(String unique_id_lv2);

}