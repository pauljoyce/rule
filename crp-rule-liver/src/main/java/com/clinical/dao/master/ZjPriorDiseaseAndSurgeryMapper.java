package com.clinical.dao.master;
import com.clinical.model.master.PRIOR_DISEASE_AND_SURGERY;
import java.util.List;

public interface ZjPriorDiseaseAndSurgeryMapper {
    List<PRIOR_DISEASE_AND_SURGERY>  findZjPriorDiseaseAndSurgeryByUniqueId(String unique_id_lv2);

    List<String> findZjPriorDiseaseAndSurgeryByIncr();
}