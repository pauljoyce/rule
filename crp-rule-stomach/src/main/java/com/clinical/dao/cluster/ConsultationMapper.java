package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Consultation;
public interface ConsultationMapper {
    List<Consultation>  findConsultationByUniqueId(String uniqueId);
    void   saveConsultation(Consultation consultation);
    void   updateConsultation(Consultation consultation);
    void   deleteConsultation(String unique_id);

}