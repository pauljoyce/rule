package com.clinical.dao.master;
import com.clinical.model.master.INP_CONSULTATION_DOCTOR_DETAIL;
import java.util.List;

public interface ZjInpConsultationDoctorDetailMapper {
    List<INP_CONSULTATION_DOCTOR_DETAIL>  findZjInpConsultationDoctorDetailByUniqueId(String unique_id_lv2);

}