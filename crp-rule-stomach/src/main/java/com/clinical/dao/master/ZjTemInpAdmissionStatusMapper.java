package com.clinical.dao.master;
import com.clinical.model.master.TEM_INP_ADMISSION_STATUS;
import java.util.List;

public interface ZjTemInpAdmissionStatusMapper {
    List<TEM_INP_ADMISSION_STATUS>  findZjTemInpAdmissionStatusByUniqueId(String unique_id_lv2);

    List<String> findZjTemInpAdmissionStatusByIncr();
}