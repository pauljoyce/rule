package com.clinical.dao.master;
import com.clinical.model.master.NURSING_RECORD;
import java.util.List;

public interface ZjNursingRecordMapper {
    List<NURSING_RECORD>  findZjNursingRecordByUniqueId(String unique_id_lv2);

}