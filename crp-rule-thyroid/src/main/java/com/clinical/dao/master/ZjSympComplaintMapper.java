package com.clinical.dao.master;
import com.clinical.model.master.SYMP_COMPLAINT;
import java.util.List;

public interface ZjSympComplaintMapper {
    List<SYMP_COMPLAINT>  findZjSympComplaintByUniqueId(String unique_id_lv2);

}