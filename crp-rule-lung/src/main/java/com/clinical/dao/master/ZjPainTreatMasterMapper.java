package com.clinical.dao.master;
import com.clinical.model.master.PAIN_TREAT_MASTER;
import java.util.List;

public interface ZjPainTreatMasterMapper {
    List<PAIN_TREAT_MASTER>  findZjPainTreatMasterByUniqueId(String unique_id_lv2);

}