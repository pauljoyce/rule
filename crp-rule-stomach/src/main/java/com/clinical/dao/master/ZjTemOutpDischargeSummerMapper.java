package com.clinical.dao.master;
import com.clinical.model.master.TEM_OUTP_DISCHARGE_SUMMER;
import java.util.List;

public interface ZjTemOutpDischargeSummerMapper {
    List<TEM_OUTP_DISCHARGE_SUMMER>  findZjTemOutpDischargeSummerByUniqueId(String unique_id_lv2);

    List<String> findZjTemOutpDischargeSummerByIncr();
}