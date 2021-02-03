package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.BloodTransfusion;
public interface BloodTransfusionMapper {
    List<BloodTransfusion>  findBloodTransfusion(String uniqueId);
    void   saveBloodTransfusion(BloodTransfusion bloodTransfusion);
    void   updateBloodTransfusion(BloodTransfusion bloodTransfusion);

}