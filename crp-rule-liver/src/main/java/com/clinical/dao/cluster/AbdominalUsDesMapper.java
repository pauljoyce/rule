package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalUsDes;
public interface AbdominalUsDesMapper {
    List<AbdominalUsDes>  findAbdominalUsDesByUniqueId(String uniqueId);
    void   saveAbdominalUsDes(AbdominalUsDes abdominalUsDes);
    void   updateAbdominalUsDes(AbdominalUsDes abdominalUsDes);
    void   deleteAbdominalUsDes(List<String> unique_id);

}