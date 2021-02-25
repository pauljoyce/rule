package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PathologicalLn;
public interface PathologicalLnMapper {
    List<PathologicalLn>  findPathologicalLn(String uniqueId);
    void   savePathologicalLn(PathologicalLn pathologicalLn);
    void   updatePathologicalLn(PathologicalLn pathologicalLn);

}