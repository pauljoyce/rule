package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Pathological;
public interface PathologicalMapper {
    List<Pathological>  findPathological(String uniqueId);
    void   savePathological(Pathological pathological);
    void   updatePathological(Pathological pathological);

}