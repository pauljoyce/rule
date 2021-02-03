package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_US_DESCRIPTION;
import java.util.List;

public interface ZjAbdomUsDescriptionMapper {
    List<ABDOM_US_DESCRIPTION>  findZjAbdomUsDescriptionByUniqueId(String unique_id_lv2);

}