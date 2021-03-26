package com.clinical.dao.master;
import com.clinical.model.master.INP_CONSULTATION_DOCTOR_MASTER;
import java.util.List;

public interface ZjInpConsultationDoctorMasterMapper {
    List<INP_CONSULTATION_DOCTOR_MASTER>  findZjInpConsultationDoctorMasterByUniqueId(String unique_id_lv2);

    List<String> findZjInpConsultationDoctorMasterByIncr();
}