package com.clinical.dao.master;
import com.clinical.model.master.NECK_MR_DESCRIPTION;
import java.util.List;

public interface ZjNeckMrDescriptionMapper {
    List<NECK_MR_DESCRIPTION>  findZjNeckMrDescriptionByUniqueId(String unique_id_lv2);

}