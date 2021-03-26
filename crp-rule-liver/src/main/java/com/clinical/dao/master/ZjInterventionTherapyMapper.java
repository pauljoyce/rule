package com.clinical.dao.master;
import com.clinical.model.master.INTERVENTION_THERAPY;
import java.util.List;

public interface ZjInterventionTherapyMapper {
    List<INTERVENTION_THERAPY>  findZjInterventionTherapyByUniqueId(String unique_id_lv2);

    List<String> findZjInterventionTherapyByIncr();
}