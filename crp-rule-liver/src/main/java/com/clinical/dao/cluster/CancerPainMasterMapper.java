package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.CancerPainMaster;
public interface CancerPainMasterMapper {
    List<CancerPainMaster>  findCancerPainMaster(String uniqueId);
    void   saveCancerPainMaster(CancerPainMaster cancerPainMaster);
    void   updateCancerPainMaster(CancerPainMaster cancerPainMaster);

}