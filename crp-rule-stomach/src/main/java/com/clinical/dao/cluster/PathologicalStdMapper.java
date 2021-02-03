package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PathologicalStd;
public interface PathologicalStdMapper {
    List<PathologicalStd>  findPathologicalStdByUniqueId(String uniqueId);
    void   savePathologicalStd(PathologicalStd pathologicalStd);
    void   updatePathologicalStd(PathologicalStd pathologicalStd);
    void   deletePathologicalStd(String unique_id);

}