package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.OutpAdmissionStatus;
public interface OutpAdmissionStatusMapper {
    List<OutpAdmissionStatus>  findOutpAdmissionStatusByUniqueId(String uniqueId);
    void   saveOutpAdmissionStatus(OutpAdmissionStatus outpAdmissionStatus);
    void   updateOutpAdmissionStatus(OutpAdmissionStatus outpAdmissionStatus);
    void   deleteOutpAdmissionStatus(String unique_id);

}