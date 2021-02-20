package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.TemInpAdmissionStatus;
public interface TemInpAdmissionStatusMapper {
    List<TemInpAdmissionStatus>  findTemInpAdmissionStatus(String uniqueId);
    void   saveTemInpAdmissionStatus(TemInpAdmissionStatus temInpAdmissionStatus);
    void   updateTemInpAdmissionStatus(TemInpAdmissionStatus temInpAdmissionStatus);

}