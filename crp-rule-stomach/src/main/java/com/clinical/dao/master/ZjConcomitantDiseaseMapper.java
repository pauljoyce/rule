package com.clinical.dao.master;
import com.clinical.model.master.CONCOMITANT_DISEASE;
import java.util.List;

public interface ZjConcomitantDiseaseMapper {
    List<CONCOMITANT_DISEASE>  findZjConcomitantDiseaseByUniqueId(String unique_id_lv2);

    List<String> findZjConcomitantDiseaseByIncr();
}