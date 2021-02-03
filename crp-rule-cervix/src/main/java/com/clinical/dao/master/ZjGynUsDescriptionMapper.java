package com.clinical.dao.master;
import com.clinical.model.master.GYN_US_DESCRIPTION;
import java.util.List;

public interface ZjGynUsDescriptionMapper {
    List<GYN_US_DESCRIPTION>  findZjGynUsDescriptionByUniqueId(String unique_id_lv2);

}