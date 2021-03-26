package com.clinical.dao.master;
import com.clinical.model.master.SURGICAL_RECORD;
import java.util.List;

public interface ZjSurgicalRecordMapper {
    List<SURGICAL_RECORD>  findZjSurgicalRecordByUniqueId(String unique_id_lv2);

    List<String> findZjSurgicalRecordByIncr();
}