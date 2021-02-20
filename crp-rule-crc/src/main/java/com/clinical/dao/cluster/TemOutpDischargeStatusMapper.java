package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TemOutpDischargeStatus;
public interface TemOutpDischargeStatusMapper {
    List<TemOutpDischargeStatus>  findTemOutpDischargeStatus(String uniqueId);
    void   saveTemOutpDischargeStatus(TemOutpDischargeStatus temOutpDischargeStatus);
    void   updateTemOutpDischargeStatus(TemOutpDischargeStatus temOutpDischargeStatus);

}