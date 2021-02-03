package com.clinical.dao.master;
import com.clinical.model.master.PHYSICAL_EXAM;
import java.util.List;

public interface ZjPhysicalExamMapper {
    List<PHYSICAL_EXAM>  findZjPhysicalExamByUniqueId(String unique_id_lv2);

    List<String> findZjPhysicalExamByIncr();
}