package com.clinical.dao.master;
import com.clinical.model.master.PROSTATE_US_DESCRIPTION;
import java.util.List;

public interface ZjProstateUsDescriptionMapper {
    List<PROSTATE_US_DESCRIPTION>  findZjProstateUsDescriptionByUniqueId(String unique_id_lv2);

}