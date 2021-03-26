package com.clinical.dao.master;
import com.clinical.model.master.TEM_PRE_COURSE_DIS;
import java.util.List;

public interface ZjTemPreCourseDisMapper {
    List<TEM_PRE_COURSE_DIS>  findZjTemPreCourseDisByUniqueId(String unique_id_lv2);

    List<String> findZjTemPreCourseDisByIncr();
}