package com.clinical.dao.master;
import com.clinical.model.master.LIS_RECORD;
import java.util.List;

public interface ZjLisRecordMapper {
    List<LIS_RECORD>  findZjLisRecordByUniqueId(String unique_id_lv2);

}