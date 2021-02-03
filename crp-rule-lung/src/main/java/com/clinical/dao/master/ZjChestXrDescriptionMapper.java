package com.clinical.dao.master;
import com.clinical.model.master.CHEST_XR_DESCRIPTION;
import java.util.List;

public interface ZjChestXrDescriptionMapper {
    List<CHEST_XR_DESCRIPTION>  findZjChestXrDescriptionByUniqueId(String unique_id_lv2);

}