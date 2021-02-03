package com.clinical.dao.master;
import com.clinical.model.master.LAB_MICRO_RESULT;
import java.util.List;

public interface ZjLabMicroResultMapper {
    List<LAB_MICRO_RESULT>  findZjLabMicroResultByUniqueId(String unique_id_lv2);

}