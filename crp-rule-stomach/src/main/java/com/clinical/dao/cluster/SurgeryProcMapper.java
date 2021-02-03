package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.SurgeryProc;
public interface SurgeryProcMapper {
    List<SurgeryProc>  findSurgeryProcByUniqueId(String uniqueId);
    void   saveSurgeryProc(SurgeryProc surgeryProc);
    void   updateSurgeryProc(SurgeryProc surgeryProc);
    void   deleteSurgeryProc(String unique_id);

}