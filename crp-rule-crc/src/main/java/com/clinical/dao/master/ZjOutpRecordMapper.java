package com.clinical.dao.master;
import com.clinical.model.master.OUTP_RECORD;
import java.util.List;

public interface ZjOutpRecordMapper {
    List<OUTP_RECORD>  findZjOutpRecordByUniqueId(String unique_id_lv2);

}