package com.clinical.dao.master;
import com.clinical.model.master.BREAST_MG_DESCRIPTION;
import java.util.List;

public interface ZjBreastMgDescriptionMapper {
    List<BREAST_MG_DESCRIPTION>  findZjBreastMgDescriptionByUniqueId(String unique_id_lv2);

}