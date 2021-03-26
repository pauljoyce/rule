package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TemInpAdmissionStatus;
public interface TemInpAdmissionStatusMapper {
    List<TemInpAdmissionStatus>  findTemInpAdmissionStatusByUniqueId(String uniqueId);
    void   saveTemInpAdmissionStatus(TemInpAdmissionStatus temInpAdmissionStatus);
    void   updateTemInpAdmissionStatus(TemInpAdmissionStatus temInpAdmissionStatus);
    void   deleteTemInpAdmissionStatus(List<String> unique_id);

}