package com.clinical.dao.master;
import com.clinical.model.master.TEM_COURSE_DIS;
import java.util.List;

public interface ZjTemCourseDisMapper {
    List<TEM_COURSE_DIS>  findZjTemCourseDisByUniqueId(String unique_id_lv2);

    List<String> findZjTemCourseDisByIncr();
}