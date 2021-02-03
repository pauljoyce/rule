package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalCt;
public interface AbdominalCtMapper {
    List<AbdominalCt>  findAbdominalCtByUniqueId(String uniqueId);
    void   saveAbdominalCt(AbdominalCt abdominalCt);
    void   updateAbdominalCt(AbdominalCt abdominalCt);
    void   deleteAbdominalCt(String unique_id);

}