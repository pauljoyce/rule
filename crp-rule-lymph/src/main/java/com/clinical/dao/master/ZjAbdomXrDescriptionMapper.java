package com.clinical.dao.master;
import com.clinical.model.master.ABDOM_XR_DESCRIPTION;
import java.util.List;

public interface ZjAbdomXrDescriptionMapper {
    List<ABDOM_XR_DESCRIPTION>  findZjAbdomXrDescriptionByUniqueId(String unique_id_lv2);

}