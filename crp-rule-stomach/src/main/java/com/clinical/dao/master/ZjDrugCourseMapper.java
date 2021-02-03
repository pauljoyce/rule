package com.clinical.dao.master;
import com.clinical.model.master.DRUG_COURSE;
import java.util.List;

public interface ZjDrugCourseMapper {
    List<DRUG_COURSE>  findZjDrugCourseByUniqueId(String unique_id_lv2);

    List<String> findZjDrugCourseByIncr();
}