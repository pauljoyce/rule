package com.clinical.dao.master;
import com.clinical.model.master.BREAST_US_DESCRIPTION;
import java.util.List;

public interface ZjBreastUsDescriptionMapper {
    List<BREAST_US_DESCRIPTION>  findZjBreastUsDescriptionByUniqueId(String unique_id_lv2);

}