package com.clinical.dao.master;
import com.clinical.model.master.PREOP_TREATMENT;
import java.util.List;

public interface ZjPreopTreatmentMapper {
    List<PREOP_TREATMENT>  findZjPreopTreatmentByUniqueId(String unique_id_lv2);
    List<PREOP_TREATMENT>  findZjPreopTreatmentById(String unique_id);
    List<PREOP_TREATMENT>  findZjPreopTreatmentByALL();


}