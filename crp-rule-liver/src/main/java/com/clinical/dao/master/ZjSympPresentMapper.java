package com.clinical.dao.master;
import com.clinical.model.master.SYMP_PRESENT;
import java.util.List;

public interface ZjSympPresentMapper {
    List<SYMP_PRESENT>  findZjSympPresentByUniqueId(String unique_id_lv2);

    List<String> findZjSympPresentByIncr();
}