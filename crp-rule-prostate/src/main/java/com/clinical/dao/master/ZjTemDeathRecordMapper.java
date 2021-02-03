package com.clinical.dao.master;
import com.clinical.model.master.TEM_DEATH_RECORD;
import java.util.List;

public interface ZjTemDeathRecordMapper {
    List<TEM_DEATH_RECORD>  findZjTemDeathRecordByUniqueId(String unique_id_lv2);

}