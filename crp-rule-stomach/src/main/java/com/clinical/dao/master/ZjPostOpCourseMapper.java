package com.clinical.dao.master;
import com.clinical.model.master.POST_OP_COURSE;
import java.util.List;

public interface ZjPostOpCourseMapper {
    List<POST_OP_COURSE>  findZjPostOpCourseByUniqueId(String unique_id_lv2);

    List<String> findZjPostOpCourseByIncr();
}