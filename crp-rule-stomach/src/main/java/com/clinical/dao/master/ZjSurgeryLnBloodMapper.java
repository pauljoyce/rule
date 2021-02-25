package com.clinical.dao.master;
import com.clinical.model.master.SURGERY_LN_BLOOD;
import java.util.List;

public interface ZjSurgeryLnBloodMapper {
    List<SURGERY_LN_BLOOD>  findZjSurgeryLnBloodByUniqueId(String unique_id_lv2);

}