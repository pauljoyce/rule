package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalMriDes;
public interface AbdominalMriDesMapper {
    List<AbdominalMriDes>  findAbdominalMriDesByUniqueId(String uniqueId);
    void   saveAbdominalMriDes(AbdominalMriDes abdominalMriDes);
    void   updateAbdominalMriDes(AbdominalMriDes abdominalMriDes);
    void   deleteAbdominalMriDes(List<String> unique_id);

}