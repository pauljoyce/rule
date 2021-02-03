package com.clinical.dao.master;
import com.clinical.model.master.LN_US_DESCRIPTION;
import java.util.List;

public interface ZjLnUsDescriptionMapper {
    List<LN_US_DESCRIPTION>  findZjLnUsDescriptionByUniqueId(String unique_id_lv2);

}