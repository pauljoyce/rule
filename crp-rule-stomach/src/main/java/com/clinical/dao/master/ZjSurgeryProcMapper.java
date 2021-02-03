package com.clinical.dao.master;
import com.clinical.model.master.SURGERY_PROC;
import java.util.List;

public interface ZjSurgeryProcMapper {
    List<SURGERY_PROC>  findZjSurgeryProcByUniqueId(String unique_id_lv2);

    List<String> findZjSurgeryProcByIncr();
}