package com.clinical.dao.master;
import com.clinical.model.master.NECK_CT_DESCRIPTION;
import java.util.List;

public interface ZjNeckCtDescriptionMapper {
    List<NECK_CT_DESCRIPTION>  findZjNeckCtDescriptionByUniqueId(String unique_id_lv2);

}