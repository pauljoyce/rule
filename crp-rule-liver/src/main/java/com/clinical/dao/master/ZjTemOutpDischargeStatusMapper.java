package com.clinical.dao.master;
import com.clinical.model.master.TEM_OUTP_DISCHARGE_STATUS;
import java.util.List;

public interface ZjTemOutpDischargeStatusMapper {
    List<TEM_OUTP_DISCHARGE_STATUS>  findZjTemOutpDischargeStatusByUniqueId(String unique_id_lv2);

    List<String> findZjTemOutpDischargeStatusByIncr();
}