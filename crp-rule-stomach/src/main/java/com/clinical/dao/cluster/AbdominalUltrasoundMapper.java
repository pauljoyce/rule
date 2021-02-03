package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.AbdominalUltrasound;
public interface AbdominalUltrasoundMapper {
    List<AbdominalUltrasound>  findAbdominalUltrasoundByUniqueId(String uniqueId);
    void   saveAbdominalUltrasound(AbdominalUltrasound abdominalUltrasound);
    void   updateAbdominalUltrasound(AbdominalUltrasound abdominalUltrasound);
    void   deleteAbdominalUltrasound(String unique_id);

}