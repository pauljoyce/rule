package com.clinical.dao.master;
import com.clinical.model.master.CLINICAL_DIAG;
import java.util.List;

public interface ZjClinicalDiagMapper {
    List<CLINICAL_DIAG>  findZjClinicalDiagByUniqueId(String unique_id_lv2);

}