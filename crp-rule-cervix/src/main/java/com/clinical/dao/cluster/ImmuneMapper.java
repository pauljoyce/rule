package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Immune;
public interface ImmuneMapper {
    List<Immune>  findImmune(String uniqueId);
    void   saveImmune(Immune immune);
    void   updateImmune(Immune immune);

}