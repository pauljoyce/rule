package com.clinical.dao.master;
import com.clinical.model.master.EMERGENCY_RECORD;
import java.util.List;

public interface ZjEmergencyRecordMapper {
    List<EMERGENCY_RECORD>  findZjEmergencyRecordByUniqueId(String unique_id_lv2);

}