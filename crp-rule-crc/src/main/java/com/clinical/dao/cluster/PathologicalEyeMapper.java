package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PathologicalEye;
public interface PathologicalEyeMapper {
    List<PathologicalEye>  findPathologicalEye(String uniqueId);
    void   savePathologicalEye(PathologicalEye pathologicalEye);
    void   updatePathologicalEye(PathologicalEye pathologicalEye);

}