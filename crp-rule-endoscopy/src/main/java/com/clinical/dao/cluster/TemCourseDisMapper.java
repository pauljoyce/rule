package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TemCourseDis;
public interface TemCourseDisMapper {
    List<TemCourseDis>  findTemCourseDis(String uniqueId);
    void   saveTemCourseDis(TemCourseDis temCourseDis);
    void   updateTemCourseDis(TemCourseDis temCourseDis);

}