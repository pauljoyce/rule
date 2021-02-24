package com.clinical.dao.cluster;
import com.clinical.model.cluster.Pathological;

import java.util.List;
public interface PathologicalMapper {
    List<Pathological>  findPathologicalByUniqueId(String uniqueId);
    void   savePathological(Pathological pathological);
    void   updatePathological(Pathological pathological);

}