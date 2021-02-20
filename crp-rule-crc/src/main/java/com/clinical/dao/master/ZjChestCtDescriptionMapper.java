package com.clinical.dao.master;
import com.clinical.model.master.CHEST_CT_DESCRIPTION;
import java.util.List;

public interface ZjChestCtDescriptionMapper {
    List<CHEST_CT_DESCRIPTION>  findZjChestCtDescriptionByUniqueId(String unique_id_lv2);

}