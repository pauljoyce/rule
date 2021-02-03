package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalUsDes;
public interface AbdominalUsDesMapper {
    List<AbdominalUsDes>  findAbdominalUsDes(String uniqueId);
    void   saveAbdominalUsDes(AbdominalUsDes abdominalUsDes);
    void   updateAbdominalUsDes(AbdominalUsDes abdominalUsDes);

}