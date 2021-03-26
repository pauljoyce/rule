package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.PathologicalLn;
public interface PathologicalLnMapper {
    List<PathologicalLn>  findPathologicalLnByUniqueId(String uniqueId);
    void   savePathologicalLn(PathologicalLn pathologicalLn);
    void   updatePathologicalLn(PathologicalLn pathologicalLn);
    void   deletePathologicalLn(List<String> unique_id);

}