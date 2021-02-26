package com.clinical.dao.master;
import com.clinical.model.master.EXAM_MASTER;
import java.util.List;

public interface ZjExamMasterMapper {
    List<EXAM_MASTER>  findZjExamMasterByUniqueId(String unique_id_lv2);

}