package com.clinical.dao.master;
import com.clinical.model.master.PAIN_TREAT_MED;
import java.util.List;

public interface ZjPainTreatMedMapper {
    List<PAIN_TREAT_MED>  findZjPainTreatMedByUniqueId(String unique_id_lv2);

}