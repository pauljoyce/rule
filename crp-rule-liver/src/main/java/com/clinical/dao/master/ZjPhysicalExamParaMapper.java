package com.clinical.dao.master;
import com.clinical.model.master.PHYSICAL_EXAM_PARA;
import java.util.List;

public interface ZjPhysicalExamParaMapper {
    List<PHYSICAL_EXAM_PARA>  findZjPhysicalExamParaByUniqueId(String unique_id_lv2);

    List<String> findZjPhysicalExamParaByIncr();
}