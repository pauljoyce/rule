package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalMriDes;
public interface AbdominalMriDesMapper {
    List<AbdominalMriDes>  findAbdominalMriDes(String uniqueId);
    void   saveAbdominalMriDes(AbdominalMriDes abdominalMriDes);
    void   updateAbdominalMriDes(AbdominalMriDes abdominalMriDes);

}