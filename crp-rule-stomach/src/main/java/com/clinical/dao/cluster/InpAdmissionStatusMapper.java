package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.InpAdmissionStatus;
public interface InpAdmissionStatusMapper {
    List<InpAdmissionStatus>  findInpAdmissionStatusByUniqueId(String uniqueId);
    void   saveInpAdmissionStatus(InpAdmissionStatus inpAdmissionStatus);
    void   updateInpAdmissionStatus(InpAdmissionStatus inpAdmissionStatus);
    void   deleteInpAdmissionStatus(String unique_id);

}