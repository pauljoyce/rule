package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.NeckUltrasound;
public interface NeckUltrasoundMapper {
    List<NeckUltrasound>  findNeckUltrasoundByUniqueId(String uniqueId);
    void   saveNeckUltrasound(NeckUltrasound neckUltrasound);
    void   updateNeckUltrasound(NeckUltrasound neckUltrasound);
    void   deleteNeckUltrasound(String unique_id);

}