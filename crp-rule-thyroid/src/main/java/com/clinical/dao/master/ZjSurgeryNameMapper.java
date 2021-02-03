package com.clinical.dao.master;
import com.clinical.model.master.SURGERY_NAME;
import java.util.List;

public interface ZjSurgeryNameMapper {
    List<SURGERY_NAME>  findZjSurgeryNameByUniqueId(String unique_id_lv2);

}