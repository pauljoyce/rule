package com.clinical.dao.master;
import com.clinical.model.master.SPECIALITY_EXAM;
import java.util.List;

public interface ZjSpecialityExamMapper {
    List<SPECIALITY_EXAM>  findZjSpecialityExamByUniqueId(String unique_id_lv2);

}