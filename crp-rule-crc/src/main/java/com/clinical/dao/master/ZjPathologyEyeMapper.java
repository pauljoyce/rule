package com.clinical.dao.master;
import com.clinical.model.master.PATHOLOGY_EYE;
import java.util.List;

public interface ZjPathologyEyeMapper {
    List<PATHOLOGY_EYE>  findZjPathologyEyeByUniqueId(String unique_id_lv2);

}